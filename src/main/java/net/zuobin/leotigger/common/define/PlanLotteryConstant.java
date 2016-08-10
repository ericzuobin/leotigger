/**
 * 
 */
package net.zuobin.leotigger.common.define;

import net.zuobin.leotigger.common.lottery.LotteryType;
import net.zuobin.leotigger.common.utils.CoreDateUtils;
import org.apache.hadoop.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 *
 */
public class PlanLotteryConstant {
	
	private static final Logger logger = LoggerFactory.getLogger(PlanLotteryConstant.class.getName());

    static public final String daysInWeek = "7123456";

    static public final Map<String,String> daysInWeekMap = new HashMap<>();

	//竞彩足球让球胜平负
	public static final String JCZQ_SPF_S_VALUE = "3";//让球主队胜
	public static final String JCZQ_SPF_P_VALUE = "1";//让球主队平
	public static final String JCZQ_SPF_F_VALUE = "0";//让球主队负"
	public static final String JCZQ_SPF_S_NAME = "让球胜";//让球主队胜
	public static final String JCZQ_SPF_P_NAME = "让球平";//让球主队平
	public static final String JCZQ_SPF_F_NAME = "让球负";//让球主队负"
	//public static final String JCZQ_SPF_RQ_VALUE = "handicap";//让球主队让球数
	
	//竞彩足球胜平负
	public static final String JCZQ_SPF_WRQ_S_VALUE = "3";//主队胜
	public static final String JCZQ_SPF_WRQ_P_VALUE = "1";//主队平
	public static final String JCZQ_SPF_WRQ_F_VALUE = "0";//主队负
	public static final String JCZQ_SPF_WRQ_S_NAME = "胜";//主队胜
	public static final String JCZQ_SPF_WRQ_P_NAME = "平";//主队平
	public static final String JCZQ_SPF_WRQ_F_NAME = "负";//主队负
	
	//竞彩足球全场比分
	public static final String JCZQ_BF_ZS_1_0_VALUE = "1";//1:0
	public static final String JCZQ_BF_ZS_2_0_VALUE = "2";//2:0
	public static final String JCZQ_BF_ZS_2_1_VALUE = "3";//2:1
	public static final String JCZQ_BF_ZS_3_0_VALUE = "4";//3:0
	public static final String JCZQ_BF_ZS_3_1_VALUE = "5";//3:1
	public static final String JCZQ_BF_ZS_3_2_VALUE = "6";//3:2
	public static final String JCZQ_BF_ZS_4_0_VALUE = "7";//4:0
	public static final String JCZQ_BF_ZS_4_1_VALUE = "8";//4:1
	public static final String JCZQ_BF_ZS_4_2_VALUE = "9";//4:2
	public static final String JCZQ_BF_ZS_5_0_VALUE = "10";//5:0
	public static final String JCZQ_BF_ZS_5_1_VALUE = "11";//5:1
	public static final String JCZQ_BF_ZS_5_2_VALUE = "12";//5:2
	public static final String JCZQ_BF_ZS_QT_VALUE = "13";//胜其他
	public static final String JCZQ_BF_ZS_1_0_NAME = "胜";//1:0
	public static final String JCZQ_BF_ZS_2_0_NAME = "胜";//2:0
	public static final String JCZQ_BF_ZS_2_1_NAME = "胜";//2:1
	public static final String JCZQ_BF_ZS_3_0_NAME = "胜";//3:0
	public static final String JCZQ_BF_ZS_3_1_NAME = "胜";//3:1
	public static final String JCZQ_BF_ZS_3_2_NAME = "胜";//3:2
	public static final String JCZQ_BF_ZS_4_0_NAME = "胜";//4:0
	public static final String JCZQ_BF_ZS_4_1_NAME = "胜";//4:1
	public static final String JCZQ_BF_ZS_4_2_NAME = "胜";//4:2
	public static final String JCZQ_BF_ZS_5_0_NAME = "胜";//5:0
	public static final String JCZQ_BF_ZS_5_1_NAME = "胜";//5:1
	public static final String JCZQ_BF_ZS_5_2_NAME = "胜";//5:2
	public static final String JCZQ_BF_ZS_QT_NAME = "胜";//胜其他
	
	public static final String JCZQ_BF_ZP_0_0_VALUE = "14";//0:0
	public static final String JCZQ_BF_ZP_1_1_VALUE = "15";//1:1
	public static final String JCZQ_BF_ZP_2_2_VALUE = "16";//2:2
	public static final String JCZQ_BF_ZP_3_3_VALUE = "17";//3:3
	public static final String JCZQ_BF_ZP_QT_VALUE = "18";//平其他
	public static final String JCZQ_BF_ZP_0_0_NAME = "平";//0:0
	public static final String JCZQ_BF_ZP_1_1_NAME = "平";//1:1
	public static final String JCZQ_BF_ZP_2_2_NAME = "平";//2:2
	public static final String JCZQ_BF_ZP_3_3_NAME = "平";//3:3
	public static final String JCZQ_BF_ZP_QT_NAME = "平";//平其他
	
	public static final String JCZQ_BF_ZF_0_1_VALUE = "19";//0:1
	public static final String JCZQ_BF_ZF_0_2_VALUE = "20";//0:2
	public static final String JCZQ_BF_ZF_1_2_VALUE = "21";//1:2
	public static final String JCZQ_BF_ZF_0_3_VALUE = "22";//0:3
	public static final String JCZQ_BF_ZF_1_3_VALUE = "23";//1:3
	public static final String JCZQ_BF_ZF_2_3_VALUE = "24";//2:3
	public static final String JCZQ_BF_ZF_0_4_VALUE = "25";//0:4
	public static final String JCZQ_BF_ZF_1_4_VALUE = "26";//1:4
	public static final String JCZQ_BF_ZF_2_4_VALUE = "27";//2:4
	public static final String JCZQ_BF_ZF_0_5_VALUE = "28";//0:5
	public static final String JCZQ_BF_ZF_1_5_VALUE = "29";//1:5
	public static final String JCZQ_BF_ZF_2_5_VALUE = "30";//2:5
	public static final String JCZQ_BF_ZF_QT_VALUE = "31";//负其他
	public static final String JCZQ_BF_ZF_0_1_NAME = "负";//0:1
	public static final String JCZQ_BF_ZF_0_2_NAME = "负";//0:2
	public static final String JCZQ_BF_ZF_1_2_NAME = "负";//1:2
	public static final String JCZQ_BF_ZF_0_3_NAME = "负";//0:3
	public static final String JCZQ_BF_ZF_1_3_NAME = "负";//1:3
	public static final String JCZQ_BF_ZF_2_3_NAME = "负";//2:3
	public static final String JCZQ_BF_ZF_0_4_NAME = "负";//0:4
	public static final String JCZQ_BF_ZF_1_4_NAME = "负";//1:4
	public static final String JCZQ_BF_ZF_2_4_NAME = "负";//2:4
	public static final String JCZQ_BF_ZF_0_5_NAME = "负";//0:5
	public static final String JCZQ_BF_ZF_1_5_NAME = "负";//1:5
	public static final String JCZQ_BF_ZF_2_5_NAME = "负";//2:5
	public static final String JCZQ_BF_ZF_QT_NAME = "负";//负其他
	
	//竞彩足球总进球数
	public static final String JCZQ_JQS_0_VALUE = "1";//0
	public static final String JCZQ_JQS_1_VALUE = "2";//1
	public static final String JCZQ_JQS_2_VALUE = "3";//2
	public static final String JCZQ_JQS_3_VALUE = "4";//3
	public static final String JCZQ_JQS_4_VALUE = "5";//4
	public static final String JCZQ_JQS_5_VALUE = "6";//5
	public static final String JCZQ_JQS_6_VALUE = "7";//6
	public static final String JCZQ_JQS_7_VALUE = "8";//7+
	public static final String JCZQ_JQS_0_NAME = "0";//0
	public static final String JCZQ_JQS_1_NAME = "1";//1
	public static final String JCZQ_JQS_2_NAME = "2";//2
	public static final String JCZQ_JQS_3_NAME = "3";//3
	public static final String JCZQ_JQS_4_NAME = "4";//4
	public static final String JCZQ_JQS_5_NAME = "5";//5
	public static final String JCZQ_JQS_6_NAME = "6";//6
	public static final String JCZQ_JQS_7_NAME = "7+";//7+
	
	//竞彩足球半场胜平负
	public static final String JCZQ_BQC_SS_VALUE = "1";//-胜胜
	public static final String JCZQ_BQC_SP_VALUE = "2";//-胜平
	public static final String JCZQ_BQC_SF_VALUE = "3";//-胜负
	public static final String JCZQ_BQC_PS_VALUE = "4";//-平胜
	public static final String JCZQ_BQC_PP_VALUE = "5";//-平平
	public static final String JCZQ_BQC_PF_VALUE = "6";//-平负
	public static final String JCZQ_BQC_FS_VALUE = "7";//-负胜
	public static final String JCZQ_BQC_FP_VALUE = "8";//-负平
	public static final String JCZQ_BQC_FF_VALUE = "9";//-负负
	public static final String JCZQ_BQC_SS_NAME = "胜";//-胜胜
	public static final String JCZQ_BQC_SP_NAME = "平";//-胜平
	public static final String JCZQ_BQC_SF_NAME = "负";//-胜负
	public static final String JCZQ_BQC_PS_NAME = "胜";//-平胜
	public static final String JCZQ_BQC_PP_NAME = "平";//-平平
	public static final String JCZQ_BQC_PF_NAME = "负";//-平负
	public static final String JCZQ_BQC_FS_NAME = "胜";//-负胜
	public static final String JCZQ_BQC_FP_NAME = "平";//-负平
	public static final String JCZQ_BQC_FF_NAME = "负";//-负负

	private final static Map<LotteryType, Map<String, String>> lotteryConstantNameMap = new HashMap<LotteryType, Map<String, String>>();
	
	static {

        daysInWeekMap.put("7","周7-");
        daysInWeekMap.put("1","周1-");
        daysInWeekMap.put("2","周2-");
        daysInWeekMap.put("3","周3-");
        daysInWeekMap.put("4","周4-");
        daysInWeekMap.put("5","周5-");
        daysInWeekMap.put("6","周6-");

		Map<String, String> _80Map = new HashMap<String, String>();
		_80Map.put(JCZQ_SPF_S_VALUE, JCZQ_SPF_S_NAME);
		_80Map.put(JCZQ_SPF_P_VALUE, JCZQ_SPF_P_NAME);
		_80Map.put(JCZQ_SPF_F_VALUE, JCZQ_SPF_F_NAME);
		lotteryConstantNameMap.put(LotteryType.JCZQ_SPF, _80Map);
		
		
		Map<String, String> _81Map = new HashMap<String, String>();
		_81Map.put(JCZQ_BF_ZS_1_0_VALUE, JCZQ_BF_ZS_1_0_NAME);
		_81Map.put(JCZQ_BF_ZS_2_0_VALUE, JCZQ_BF_ZS_2_0_NAME);
		_81Map.put(JCZQ_BF_ZS_2_1_VALUE, JCZQ_BF_ZS_2_1_NAME);
		_81Map.put(JCZQ_BF_ZS_3_0_VALUE, JCZQ_BF_ZS_3_0_NAME);
		_81Map.put(JCZQ_BF_ZS_3_1_VALUE, JCZQ_BF_ZS_3_1_NAME);
		_81Map.put(JCZQ_BF_ZS_3_2_VALUE, JCZQ_BF_ZS_3_2_NAME);
		_81Map.put(JCZQ_BF_ZS_4_0_VALUE, JCZQ_BF_ZS_4_0_NAME);
		_81Map.put(JCZQ_BF_ZS_4_1_VALUE, JCZQ_BF_ZS_4_1_NAME);
		_81Map.put(JCZQ_BF_ZS_4_2_VALUE, JCZQ_BF_ZS_4_2_NAME);
		_81Map.put(JCZQ_BF_ZS_5_0_VALUE, JCZQ_BF_ZS_5_0_NAME);
		_81Map.put(JCZQ_BF_ZS_5_1_VALUE, JCZQ_BF_ZS_5_1_NAME);
		_81Map.put(JCZQ_BF_ZS_5_2_VALUE, JCZQ_BF_ZS_5_2_NAME);
		_81Map.put(JCZQ_BF_ZS_QT_VALUE, JCZQ_BF_ZS_QT_NAME);
		
		_81Map.put(JCZQ_BF_ZP_0_0_VALUE, JCZQ_BF_ZP_0_0_NAME);
		_81Map.put(JCZQ_BF_ZP_1_1_VALUE, JCZQ_BF_ZP_1_1_NAME);
		_81Map.put(JCZQ_BF_ZP_2_2_VALUE, JCZQ_BF_ZP_2_2_NAME);
		_81Map.put(JCZQ_BF_ZP_3_3_VALUE, JCZQ_BF_ZP_3_3_NAME);
		_81Map.put(JCZQ_BF_ZP_QT_VALUE, JCZQ_BF_ZP_QT_NAME);
		
		_81Map.put(JCZQ_BF_ZF_0_1_VALUE, JCZQ_BF_ZF_0_1_NAME);
		_81Map.put(JCZQ_BF_ZF_0_2_VALUE, JCZQ_BF_ZF_0_2_NAME);
		_81Map.put(JCZQ_BF_ZF_1_2_VALUE, JCZQ_BF_ZF_1_2_NAME);
		_81Map.put(JCZQ_BF_ZF_0_3_VALUE, JCZQ_BF_ZF_0_3_NAME);
		_81Map.put(JCZQ_BF_ZF_1_3_VALUE, JCZQ_BF_ZF_1_3_NAME);
		_81Map.put(JCZQ_BF_ZF_2_3_VALUE, JCZQ_BF_ZF_2_3_NAME);
		_81Map.put(JCZQ_BF_ZF_0_4_VALUE, JCZQ_BF_ZF_0_4_NAME);
		_81Map.put(JCZQ_BF_ZF_1_4_VALUE, JCZQ_BF_ZF_1_4_NAME);
		_81Map.put(JCZQ_BF_ZF_2_4_VALUE, JCZQ_BF_ZF_2_4_NAME);
		_81Map.put(JCZQ_BF_ZF_0_5_VALUE, JCZQ_BF_ZF_0_5_NAME);
		_81Map.put(JCZQ_BF_ZF_1_5_VALUE, JCZQ_BF_ZF_1_5_NAME);
		_81Map.put(JCZQ_BF_ZF_2_5_VALUE, JCZQ_BF_ZF_2_5_NAME);
		_81Map.put(JCZQ_BF_ZF_QT_VALUE, JCZQ_BF_ZF_QT_NAME);
		lotteryConstantNameMap.put(LotteryType.JCZQ_BF, _81Map);
		
		Map<String, String> _82Map = new HashMap<String, String>();
		_82Map.put(JCZQ_JQS_0_VALUE, JCZQ_JQS_0_NAME);
		_82Map.put(JCZQ_JQS_1_VALUE, JCZQ_JQS_1_NAME);
		_82Map.put(JCZQ_JQS_2_VALUE, JCZQ_JQS_2_NAME);
		_82Map.put(JCZQ_JQS_3_VALUE, JCZQ_JQS_3_NAME);
		_82Map.put(JCZQ_JQS_4_VALUE, JCZQ_JQS_4_NAME);
		_82Map.put(JCZQ_JQS_5_VALUE, JCZQ_JQS_5_NAME);
		_82Map.put(JCZQ_JQS_6_VALUE, JCZQ_JQS_6_NAME);
		_82Map.put(JCZQ_JQS_7_VALUE, JCZQ_JQS_7_NAME);
		lotteryConstantNameMap.put(LotteryType.JCZQ_JQS, _82Map);
		
		Map<String, String> _83Map = new HashMap<String, String>();
		_83Map.put(JCZQ_BQC_SS_VALUE, JCZQ_BQC_SS_NAME);
		_83Map.put(JCZQ_BQC_SP_VALUE, JCZQ_BQC_SP_NAME);
		_83Map.put(JCZQ_BQC_SF_VALUE, JCZQ_BQC_SF_NAME);
		_83Map.put(JCZQ_BQC_PS_VALUE, JCZQ_BQC_PS_NAME);
		_83Map.put(JCZQ_BQC_PP_VALUE, JCZQ_BQC_PP_NAME);
		_83Map.put(JCZQ_BQC_PF_VALUE, JCZQ_BQC_PF_NAME);
		_83Map.put(JCZQ_BQC_FS_VALUE, JCZQ_BQC_FS_NAME);
		_83Map.put(JCZQ_BQC_FP_VALUE, JCZQ_BQC_FP_NAME);
		_83Map.put(JCZQ_BQC_FF_VALUE, JCZQ_BQC_FF_NAME);
		lotteryConstantNameMap.put(LotteryType.JCZQ_BQC, _83Map);
		
		Map<String, String> _85Map = new HashMap<String, String>();
		_85Map.put(JCZQ_SPF_WRQ_S_VALUE, JCZQ_SPF_WRQ_S_NAME);
		_85Map.put(JCZQ_SPF_WRQ_P_VALUE, JCZQ_SPF_WRQ_P_NAME);
		_85Map.put(JCZQ_SPF_WRQ_F_VALUE, JCZQ_SPF_WRQ_F_NAME);
		lotteryConstantNameMap.put(LotteryType.JCZQ_SPF_WRQ, _85Map);
	}

	
	public static String getLotteryBetContent(String raceid , LotteryType lotteryType, String key) {

        Date matchDate = CoreDateUtils.parseDate(raceid.substring(0, 8), "yyyyMMdd");
        Calendar cal = Calendar.getInstance();
        cal.setTime(matchDate);
        //星期编码转换后和出票商对应(周一到周日用1-7表示)
        String dayofweek = String.valueOf(daysInWeek.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));

        String match = daysInWeekMap.get(dayofweek) + raceid.substring(10);

        String lottery = "";
        if (lotteryType.getValue() == LotteryType.JCZQ_HHGG.getValue() || lotteryType.getValue() == LotteryType.JCZQ_HHDG.getValue()) {
            String[] keyArray =  StringUtils.split(key, "$".charAt(0));
            LotteryType tempLottery = LotteryType.getItem(Integer.parseInt(keyArray[1]));

            if (tempLottery.getValue() == LotteryType.JCZQ_BQC.getValue() || tempLottery.getValue() == LotteryType.JCZQ_BF.getValue()) {
                lottery = LotteryType.JCZQ_SPF_WRQ.getName();
            }else {
                lottery = tempLottery.getName();
            }
        }else {
            lottery = lotteryType.getName();
        }
        String betElement =PlanLotteryConstant.getLotteryConstantName(lotteryType,key);
        return "[" + lottery + "]" + "(" + match +  ")" + "(" + betElement + ")";
	}

	public static String getLotteryConstantName(LotteryType lotteryType, String key) {

        if (lotteryType.getValue() == LotteryType.JCZQ_HHGG.getValue() || lotteryType.getValue() == LotteryType.JCZQ_HHDG.getValue()) {
             String[] keyArray =  StringUtils.split(key, "$".charAt(0));
             LotteryType lottery = LotteryType.getItem(Integer.parseInt(keyArray[1]));
             return getConstantName(lottery,keyArray[0]);
        }
		return getConstantName(lotteryType,key);
	}

    private static String getConstantName(LotteryType lotteryType, String key) {

        if (lotteryConstantNameMap == null || !lotteryConstantNameMap.containsKey(lotteryType)) {
            logger.error("未找到彩种({})的投注项名称定义", lotteryType.getName());
            return null;
        }

        Map<String, String> lotteryMap = lotteryConstantNameMap.get(lotteryType);
        if (lotteryMap != null && lotteryMap.containsKey(key)) {
            return lotteryMap.get(key);
        }

        return null;
    }
	
	private final static Map<LotteryType, List<String>> lotteryConstantMap = new HashMap<LotteryType, List<String>>();
	
	static {
		List<String> _80List = new ArrayList<String>();
		_80List.add(JCZQ_SPF_S_VALUE);
		_80List.add(JCZQ_SPF_P_VALUE);
        _80List.add(JCZQ_SPF_F_VALUE);
		//_80List.add(JCZQ_SPF_RQ_VALUE);
		lotteryConstantMap.put(LotteryType.JCZQ_SPF, _80List);
		
		List<String> _81List = new ArrayList<String>();
		_81List.add(JCZQ_BF_ZS_1_0_VALUE);
		_81List.add(JCZQ_BF_ZS_2_0_VALUE);
		_81List.add(JCZQ_BF_ZS_2_1_VALUE);
        _81List.add(JCZQ_BF_ZS_3_0_VALUE);
		_81List.add(JCZQ_BF_ZS_3_1_VALUE);
		_81List.add(JCZQ_BF_ZS_3_2_VALUE);
        _81List.add(JCZQ_BF_ZS_4_0_VALUE);
		_81List.add(JCZQ_BF_ZS_4_1_VALUE);
		_81List.add(JCZQ_BF_ZS_4_2_VALUE);
        _81List.add(JCZQ_BF_ZS_5_0_VALUE);
		_81List.add(JCZQ_BF_ZS_5_1_VALUE);
		_81List.add(JCZQ_BF_ZS_5_2_VALUE);
        _81List.add(JCZQ_BF_ZS_QT_VALUE);
		_81List.add(JCZQ_BF_ZP_0_0_VALUE);
		_81List.add(JCZQ_BF_ZP_1_1_VALUE);
        _81List.add(JCZQ_BF_ZP_2_2_VALUE);
		_81List.add(JCZQ_BF_ZP_3_3_VALUE);
		_81List.add(JCZQ_BF_ZP_QT_VALUE);
		_81List.add(JCZQ_BF_ZF_0_1_VALUE);
        _81List.add(JCZQ_BF_ZF_0_2_VALUE);
		_81List.add(JCZQ_BF_ZF_1_2_VALUE);
		_81List.add(JCZQ_BF_ZF_0_3_VALUE);
        _81List.add(JCZQ_BF_ZF_1_3_VALUE);
		_81List.add(JCZQ_BF_ZF_2_3_VALUE);
		_81List.add(JCZQ_BF_ZF_0_4_VALUE);
        _81List.add(JCZQ_BF_ZF_1_4_VALUE);
		_81List.add(JCZQ_BF_ZF_2_4_VALUE);
		_81List.add(JCZQ_BF_ZF_0_5_VALUE);
        _81List.add(JCZQ_BF_ZF_1_5_VALUE);
		_81List.add(JCZQ_BF_ZF_2_5_VALUE);
		_81List.add(JCZQ_BF_ZF_QT_VALUE);
		lotteryConstantMap.put(LotteryType.JCZQ_BF, _81List);
		
		List<String> _82List = new ArrayList<String>();
		_82List.add(JCZQ_JQS_0_VALUE);
		_82List.add(JCZQ_JQS_1_VALUE);
		_82List.add(JCZQ_JQS_2_VALUE);
		_82List.add(JCZQ_JQS_3_VALUE);
		_82List.add(JCZQ_JQS_4_VALUE);
		_82List.add(JCZQ_JQS_5_VALUE);
		_82List.add(JCZQ_JQS_6_VALUE);
		_82List.add(JCZQ_JQS_7_VALUE);
		lotteryConstantMap.put(LotteryType.JCZQ_JQS, _82List);
		
		List<String> _83List = new ArrayList<String>();
		_83List.add(JCZQ_BQC_SS_VALUE);
		_83List.add(JCZQ_BQC_SP_VALUE);
		_83List.add(JCZQ_BQC_SF_VALUE);
        _83List.add(JCZQ_BQC_PS_VALUE);
		_83List.add(JCZQ_BQC_PP_VALUE);
		_83List.add(JCZQ_BQC_PF_VALUE);
        _83List.add(JCZQ_BQC_FS_VALUE);
		_83List.add(JCZQ_BQC_FP_VALUE);
		_83List.add(JCZQ_BQC_FF_VALUE);
		lotteryConstantMap.put(LotteryType.JCZQ_BQC, _83List);
		
		List<String> _85List = new ArrayList<String>();
		_85List.add(JCZQ_SPF_WRQ_S_VALUE);
		_85List.add(JCZQ_SPF_WRQ_P_VALUE);
        _85List.add(JCZQ_SPF_WRQ_F_VALUE);
		lotteryConstantMap.put(LotteryType.JCZQ_SPF_WRQ, _85List);
	}
	
	public static List<String> getLotteryConstantList(LotteryType lotteryType) {
		return lotteryConstantMap.get(lotteryType);
	}

    public static String getHHGGAttribute(LotteryType lotteryType, String attribute) {
        return attribute + "$" + lotteryType.getValue();
    }
}
