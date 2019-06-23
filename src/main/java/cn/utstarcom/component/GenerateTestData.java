package cn.utstarcom.component;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateTestData {
    public static long getId() {
        return (long) (Math.random() * 1000000000000l);
    }
    public static String getRadomCOLLECTIONDATE() {
        String year[] = { "2018" };
        String month[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        String day[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };
        String hour[] = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23" };
        String minute[] = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
                "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
                "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };
        String second[] = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31",
                "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48",
                "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };
        int index1 = (int) (Math.random() * year.length);
        int index2 = (int) (Math.random() * month.length);
        int index3 = (int) (Math.random() * day.length);
        int index4 = (int) (Math.random() * hour.length);
        int index5 = (int) (Math.random() * minute.length);
        int index6 = (int) (Math.random() * second.length);
        String coliectiondate = year[index1] + "-" + month[index2] + "-" + day[index3] + "T" + hour[index4] + ":"
                + minute[index5] + ":" + second[index6] + "Z";
        return coliectiondate;
    }
    public static String getRandomText() {
        String test[] = { "accumulo-core-1.6.0.jar", "accumulo-fate-1.6.0.jar", "accumulo-start-1.6.0.jar",
                "accumulo-trace-1.6.0.jar", "activation-1.1.jar", "activemq-client-5.10.2.jar",
                "akka-actor_2.10-2.2.3-shaded-protobuf.jar", "akka-remote_2.10-2.2.3-shaded-protobuf.jar",
                "akka-slf4j_2.10-2.2.3-shaded-protobuf.jar", "akuma-1.9.jar", "algebird-core_2.10-0.6.0.jar"};
        int index1 = (int) (Math.random() * test.length);
        return test[index1];
    }
    public static String getRandomTextCh() {
        String test[] = {
                "贾玲，原名贾裕玲。1982年4月29日出生于湖北襄阳，毕业于中央戏剧学院。喜剧女演员，师从冯巩，发起并创立酷口相声。2003年获《全国相声小品邀请赛》相声一等奖。2006年《中央电视台》第三届相声大赛专业组二等奖。2009年7月，由贾玲、邹僧等人创办的新笑声客栈开张，成为酷口相声的大本营。2010年2月14日，贾玲首次登上央视春晚的舞台表演相声《大话捧逗》，并获“我最喜爱的春晚节目”曲艺组三等奖。2011年2月2日，再次登上央视春晚舞台，表演相声《芝麻开门》。",
                "要实现近实时搜索，就必须有一种机制来实时的处理数据然后生成到solr的索引中去，flume-ng刚好提供了这样一种机>制，它可以实时收集数据，然后通过MorphlineSolrSink对数据进行ETL，最后写入到solr的索引中，这样就能在solr搜索引擎中近实时的查询到新进来的数据了由贾玲人。",
                "如上图，每个缓冲区以四个字节开头，中间是多个字节的缓冲数据，最后以一个空缓冲区结尾。",
                "实际还是围绕着Agent的三个组件Source、Channel、Sink来看它能够支持哪些技术或协议。我们不再对各个组件支持的协议详细配置进行说明，通过列表的方式分别对三个组件进行概要说明",
                "下面写一个最简单的Hello World例子，以便对RESTful WebService有个感性认识。因为非常专业理论化的描述RESTful WebService是一件理解起来很痛苦的事情。看看例子就知道个大概了，再看理论就容易理解多了。",
                "据香港经济日报报道，传小米可能在下周向港交所提交上市申请。经济日报此前还报道，小米最近数月不乏上市前股东售股活动，售股价格显示公司估值介乎650亿至700亿美元。此前，曾有多个小米估值的版本出现，比如1000亿美元，甚至2000亿美元，小米方面都未进行置评",
                "最近,中超新晋土豪苏宁可谓是频出大手笔。夏窗尚未开启,苏宁就早早开始谋划了。", "尽管距离泰达与恒大的比赛还有2天的时间,但比赛的硝烟已经开始弥漫。",
                "据美国媒体报道,美国当地时间21日上午,流行音乐传奇人物王子(Prince)被发现死于位于明尼苏达的住所内,医务人员进行了紧急抢救,但最终回天无力,享年57岁。",
                "016年4月19日,周杰伦召开记者会,正式宣布:与杰藝文創合作,收购S2冠军战队台北暗杀星TPA,并正式更名为",
                "上周五,麦格希金融在一项声明中说,这笔交易预计在今年第三季度完成,目前正在等待监管部门的审批" };
        int index1 = (int) (Math.random() * test.length);
        return test[index1];
    }
    public static String getData() {
        StringBuffer sbf = new StringBuffer();
        sbf.append("{\"id\": \"" + getId() + "\",\"created_at\": \"" + getRadomCOLLECTIONDATE() + "\", \"text\": \""
                + getRandomText() + "\",\"text_cn\":\"" + getRandomTextCh() + "\"}");
        return sbf.toString();
    }
    public static void write(int n, String file) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(file, true), 4194304);
            for (int i = 0; i < n; i++) {
                bw.write(getData() + "\r\n");
            }
            System.out.println("数据生成完毕！" + file);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("数据生成异常！");
        } finally {
            try {
                bw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        write(3000000, "/root/data1.txt");
    }
}
