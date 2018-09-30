package com.nbq.blog.apiserver.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

// 演示例子，执行 main 方法控制台输入模块表名回车自动生成对应项目目录中
public class CodeGenerator {

    private static String OUTPUT = "D://WorkbenchForIDEA/code/blog";
    private static String AUTHOR = "Ben";
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USER = "root";
    private static String PASSWORD = "123456";
    private static String URL = "jdbc:mysql://localhost:3306/blog?useUnicode=true&characterEncoding=utf8";
    private static String PACKET_PARENT = "com.nbq.blogserver.web";

    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(OUTPUT);
        gc.setFileOverride(true);
        gc.setActiveRecord(true);
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(false);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        gc.setAuthor(AUTHOR);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
//         gc.setControllerName("%sController");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setDriverName(DRIVER);
        dsc.setUsername(USER);
        dsc.setPassword(PASSWORD);
        dsc.setUrl(URL);
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
//        strategy.setTablePrefix(new String[]{""});// 此处可以修改为您的表前缀
//        strategy.setNaming(NamingStrategy.remove_prefix_and_camel);// 表名生成策略
//        strategy.setNaming(NamingStrategy.removePrefixAndCamel());// 表名生成策略
//        strategy.setInclude(new String[]{"user"}); // 需要生成的表
//        strategy.setExclude(new String[]{"t_rong_bid"}); // 排除生成的表
        // 字段名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);
        // 自定义实体父类
//         strategy.setSuperEntityClass("hello.entity.BaseEntity");
        // 自定义实体，公共字段
        strategy.setSuperEntityColumns(new String[]{"id"});
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.fcs.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.fcs.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.fcs.demo.TestServiceImpl");
        // 自定义 controller 父类
//         strategy.setSuperControllerClass("com.risk.controller.BaseController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuliderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(PACKET_PARENT);

        mpg.setPackageInfo(pc);

        // 执行生成
        mpg.execute();
    }

}