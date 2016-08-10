/**
 * 
 */
package net.zuobin.leotigger.common.define;

import net.zuobin.leotigger.common.lottery.LotteryType;
import org.apache.hadoop.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sunshow
 *
 */
public class LotteryConstant {
	
	private static final Logger logger = LoggerFactory.getLogger(LotteryConstant.class.getName());
	
	//竞彩足球让球胜平负
	public static final String JCZQ_SPF_S_VALUE = "3";//让球胜平负-主队胜
	public static final String JCZQ_SPF_P_VALUE = "1";//让球胜平负-主队平
	public static final String JCZQ_SPF_F_VALUE = "0";//让球胜平负-主队负"
	public static final String JCZQ_SPF_S_NAME = "让球胜平负-胜";//让球胜平负-主队胜
	public static final String JCZQ_SPF_P_NAME = "让球胜平负-平";//让球胜平负-主队平
	public static final String JCZQ_SPF_F_NAME = "让球胜平负-负";//让球胜平负-主队负"
	//public static final String JCZQ_SPF_RQ_VALUE = "handicap";//让球胜平负-主队让球数
	
	//竞彩足球胜平负
	public static final String JCZQ_SPF_WRQ_S_VALUE = "3";//胜平负-主队胜
	public static final String JCZQ_SPF_WRQ_P_VALUE = "1";//胜平负-主队平
	public static final String JCZQ_SPF_WRQ_F_VALUE = "0";//胜平负-主队负
	public static final String JCZQ_SPF_WRQ_S_NAME = "胜平负-胜";//胜平负-主队胜
	public static final String JCZQ_SPF_WRQ_P_NAME = "胜平负-平";//胜平负-主队平
	public static final String JCZQ_SPF_WRQ_F_NAME = "胜平负-负";//胜平负-主队负
	
	//竞彩足球全场比分
	public static final String JCZQ_BF_ZS_1_0_VALUE = "1";//主胜-1:0
	public static final String JCZQ_BF_ZS_2_0_VALUE = "2";//主胜-2:0
	public static final String JCZQ_BF_ZS_2_1_VALUE = "3";//主胜-2:1
	public static final String JCZQ_BF_ZS_3_0_VALUE = "4";//主胜-3:0
	public static final String JCZQ_BF_ZS_3_1_VALUE = "5";//主胜-3:1
	public static final String JCZQ_BF_ZS_3_2_VALUE = "6";//主胜-3:2
	public static final String JCZQ_BF_ZS_4_0_VALUE = "7";//主胜-4:0
	public static final String JCZQ_BF_ZS_4_1_VALUE = "8";//主胜-4:1
	public static final String JCZQ_BF_ZS_4_2_VALUE = "9";//主胜-4:2
	public static final String JCZQ_BF_ZS_5_0_VALUE = "10";//主胜-5:0
	public static final String JCZQ_BF_ZS_5_1_VALUE = "11";//主胜-5:1
	public static final String JCZQ_BF_ZS_5_2_VALUE = "12";//主胜-5:2
	public static final String JCZQ_BF_ZS_QT_VALUE = "13";//主胜-胜其他
	public static final String JCZQ_BF_ZS_1_0_NAME = "主胜-1:0";//主胜-1:0
	public static final String JCZQ_BF_ZS_2_0_NAME = "主胜-2:0";//主胜-2:0
	public static final String JCZQ_BF_ZS_2_1_NAME = "主胜-2:1";//主胜-2:1
	public static final String JCZQ_BF_ZS_3_0_NAME = "主胜-3:0";//主胜-3:0
	public static final String JCZQ_BF_ZS_3_1_NAME = "主胜-3:1";//主胜-3:1
	public static final String JCZQ_BF_ZS_3_2_NAME = "主胜-3:2";//主胜-3:2
	public static final String JCZQ_BF_ZS_4_0_NAME = "主胜-4:0";//主胜-4:0
	public static final String JCZQ_BF_ZS_4_1_NAME = "主胜-4:1";//主胜-4:1
	public static final String JCZQ_BF_ZS_4_2_NAME = "主胜-4:2";//主胜-4:2
	public static final String JCZQ_BF_ZS_5_0_NAME = "主胜-5:0";//主胜-5:0
	public static final String JCZQ_BF_ZS_5_1_NAME = "主胜-5:1";//主胜-5:1
	public static final String JCZQ_BF_ZS_5_2_NAME = "主胜-5:2";//主胜-5:2
	public static final String JCZQ_BF_ZS_QT_NAME = "主胜-胜其他";//主胜-胜其他
	
	public static final String JCZQ_BF_ZP_0_0_VALUE = "14";//主平-0:0
	public static final String JCZQ_BF_ZP_1_1_VALUE = "15";//主平-1:1
	public static final String JCZQ_BF_ZP_2_2_VALUE = "16";//主平-2:2
	public static final String JCZQ_BF_ZP_3_3_VALUE = "17";//主平-3:3
	public static final String JCZQ_BF_ZP_QT_VALUE = "18";//主平-平其他
	public static final String JCZQ_BF_ZP_0_0_NAME = "主平-0:0";//主平-0:0
	public static final String JCZQ_BF_ZP_1_1_NAME = "主平-1:1";//主平-1:1
	public static final String JCZQ_BF_ZP_2_2_NAME = "主平-2:2";//主平-2:2
	public static final String JCZQ_BF_ZP_3_3_NAME = "主平-3:3";//主平-3:3
	public static final String JCZQ_BF_ZP_QT_NAME = "主平-平其他";//主平-平其他
	
	public static final String JCZQ_BF_ZF_0_1_VALUE = "19";//主负-0:1
	public static final String JCZQ_BF_ZF_0_2_VALUE = "20";//主负-0:2
	public static final String JCZQ_BF_ZF_1_2_VALUE = "21";//主负-1:2
	public static final String JCZQ_BF_ZF_0_3_VALUE = "22";//主负-0:3
	public static final String JCZQ_BF_ZF_1_3_VALUE = "23";//主负-1:3
	public static final String JCZQ_BF_ZF_2_3_VALUE = "24";//主负-2:3
	public static final String JCZQ_BF_ZF_0_4_VALUE = "25";//主负-0:4
	public static final String JCZQ_BF_ZF_1_4_VALUE = "26";//主负-1:4
	public static final String JCZQ_BF_ZF_2_4_VALUE = "27";//主负-2:4
	public static final String JCZQ_BF_ZF_0_5_VALUE = "28";//主负-0:5
	public static final String JCZQ_BF_ZF_1_5_VALUE = "29";//主负-1:5
	public static final String JCZQ_BF_ZF_2_5_VALUE = "30";//主负-2:5
	public static final String JCZQ_BF_ZF_QT_VALUE = "31";//主负-负其他
	public static final String JCZQ_BF_ZF_0_1_NAME = "主负-0:1";//主负-0:1
	public static final String JCZQ_BF_ZF_0_2_NAME = "主负-0:2";//主负-0:2
	public static final String JCZQ_BF_ZF_1_2_NAME = "主负-1:2";//主负-1:2
	public static final String JCZQ_BF_ZF_0_3_NAME = "主负-0:3";//主负-0:3
	public static final String JCZQ_BF_ZF_1_3_NAME = "主负-1:3";//主负-1:3
	public static final String JCZQ_BF_ZF_2_3_NAME = "主负-2:3";//主负-2:3
	public static final String JCZQ_BF_ZF_0_4_NAME = "主负-0:4";//主负-0:4
	public static final String JCZQ_BF_ZF_1_4_NAME = "主负-1:4";//主负-1:4
	public static final String JCZQ_BF_ZF_2_4_NAME = "主负-2:4";//主负-2:4
	public static final String JCZQ_BF_ZF_0_5_NAME = "主负-0:5";//主负-0:5
	public static final String JCZQ_BF_ZF_1_5_NAME = "主负-1:5";//主负-1:5
	public static final String JCZQ_BF_ZF_2_5_NAME = "主负-2:5";//主负-2:5
	public static final String JCZQ_BF_ZF_QT_NAME = "主负-负其他";//主负-负其他
	
	//竞彩足球总进球数
	public static final String JCZQ_JQS_0_VALUE = "1";//总进球数-0
	public static final String JCZQ_JQS_1_VALUE = "2";//总进球数-1
	public static final String JCZQ_JQS_2_VALUE = "3";//总进球数-2
	public static final String JCZQ_JQS_3_VALUE = "4";//总进球数-3
	public static final String JCZQ_JQS_4_VALUE = "5";//总进球数-4
	public static final String JCZQ_JQS_5_VALUE = "6";//总进球数-5
	public static final String JCZQ_JQS_6_VALUE = "7";//总进球数-6
	public static final String JCZQ_JQS_7_VALUE = "8";//总进球数-7+
	public static final String JCZQ_JQS_0_NAME = "总进球数-0";//总进球数-0
	public static final String JCZQ_JQS_1_NAME = "总进球数-1";//总进球数-1
	public static final String JCZQ_JQS_2_NAME = "总进球数-2";//总进球数-2
	public static final String JCZQ_JQS_3_NAME = "总进球数-3";//总进球数-3
	public static final String JCZQ_JQS_4_NAME = "总进球数-4";//总进球数-4
	public static final String JCZQ_JQS_5_NAME = "总进球数-5";//总进球数-5
	public static final String JCZQ_JQS_6_NAME = "总进球数-6";//总进球数-6
	public static final String JCZQ_JQS_7_NAME = "总进球数-7+";//总进球数-7+
	
	//竞彩足球半场胜平负
	public static final String JCZQ_BQC_SS_VALUE = "1";//半全场胜平负-胜胜
	public static final String JCZQ_BQC_SP_VALUE = "2";//半全场胜平负-胜平
	public static final String JCZQ_BQC_SF_VALUE = "3";//半全场胜平负-胜负
	public static final String JCZQ_BQC_PS_VALUE = "4";//半全场胜平负-平胜
	public static final String JCZQ_BQC_PP_VALUE = "5";//半全场胜平负-平平
	public static final String JCZQ_BQC_PF_VALUE = "6";//半全场胜平负-平负
	public static final String JCZQ_BQC_FS_VALUE = "7";//半全场胜平负-负胜
	public static final String JCZQ_BQC_FP_VALUE = "8";//半全场胜平负-负平
	public static final String JCZQ_BQC_FF_VALUE = "9";//半全场胜平负-负负
	public static final String JCZQ_BQC_SS_NAME = "半全场胜平负-胜胜";//半全场胜平负-胜胜
	public static final String JCZQ_BQC_SP_NAME = "半全场胜平负-胜平";//半全场胜平负-胜平
	public static final String JCZQ_BQC_SF_NAME = "半全场胜平负-胜负";//半全场胜平负-胜负
	public static final String JCZQ_BQC_PS_NAME = "半全场胜平负-平胜";//半全场胜平负-平胜
	public static final String JCZQ_BQC_PP_NAME = "半全场胜平负-平平";//半全场胜平负-平平
	public static final String JCZQ_BQC_PF_NAME = "半全场胜平负-平负";//半全场胜平负-平负
	public static final String JCZQ_BQC_FS_NAME = "半全场胜平负-负胜";//半全场胜平负-负胜
	public static final String JCZQ_BQC_FP_NAME = "半全场胜平负-负平";//半全场胜平负-负平
	public static final String JCZQ_BQC_FF_NAME = "半全场胜平负-负负";//半全场胜平负-负负

	private final static Map<LotteryType, Map<String, String>> lotteryConstantNameMap = new HashMap<LotteryType, Map<String, String>>();
	
	static {
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

	
	public static String getLotteryBetContent(LotteryType lotteryType, String key) {
        String lottery = "";
        if (lotteryType.getValue() == LotteryType.JCZQ_HHGG.getValue() || lotteryType.getValue() == LotteryType.JCZQ_HHDG.getValue()) {
            String[] keyArray =  StringUtils.split(key, "$".charAt(0));
            lottery = LotteryType.getItem(Integer.parseInt(keyArray[1])).getName();
        }else {
            lottery = lotteryType.getName();
        }
        String betElement =LotteryConstant.getLotteryConstantName(lotteryType,key);
        return lottery + "$" + betElement;
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
