package net.zuobin.leotigger.common.lottery;

import net.zuobin.leotigger.common.define.IntegerBeanLabelItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PlayType extends IntegerBeanLabelItem {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = LoggerFactory.getLogger(PlayType.class.getName());
	
	private static Map<LotteryType, List<PlayType>> lotteryItems = new HashMap<LotteryType, List<PlayType>>(64);
	
	private LotteryType lotteryType;

	protected PlayType(String name, int value, LotteryType lotteryType) {
		super(PlayType.class.getName(), name, value);
		
		if (lotteryType != null) {
			this.lotteryType = lotteryType;
			
			List<PlayType> list = lotteryItems.get(lotteryType);
			if (list == null) {
				list = new ArrayList<PlayType>();
				list.add(PlayType.ALL);		//每一个彩种的集合都添加ALL，供查询使用
				lotteryItems.put(lotteryType, list);
			}
			list.add(this);
		}
	}
	
	public LotteryType getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(LotteryType lotteryType) {
		this.lotteryType = lotteryType;
	}

	public static List<PlayType> getItemsByLotteryType(LotteryType lotteryType) {
		return lotteryItems.get(lotteryType);
	}
	
	public static PlayType getItem(int value){
		try {
			return (PlayType)PlayType.getResult(PlayType.class.getName(), value);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}
	
	public static final PlayType ALL = new PlayType("全部", -1, null);
	
	public static final PlayType DEFAULT = new PlayType("默认", 0, null);
	
	public static final PlayType JCZQ_SPF_GD = new PlayType("固定奖金", 8000, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_FD = new PlayType("浮动奖金", 8001, LotteryType.JCZQ_SPF);
	
	public static final PlayType JCZQ_SPF_FD_1 = new PlayType("浮动奖金单关", 8002, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_2_1 = new PlayType("固定奖金2串1", 8003, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_3_1 = new PlayType("固定奖金3串1", 8004, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_4_1 = new PlayType("固定奖金4串1", 8005, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_1 = new PlayType("固定奖金5串1", 8006, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_1 = new PlayType("固定奖金6串1", 8007, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_3_3 = new PlayType("固定奖金3串3", 8008, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_3_4 = new PlayType("固定奖金3串4", 8009, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_4_4 = new PlayType("固定奖金4串4", 8010, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_4_5 = new PlayType("固定奖金4串5", 8011, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_4_6 = new PlayType("固定奖金4串6", 8012, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_4_11 = new PlayType("固定奖金4串11", 8013, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_5 = new PlayType("固定奖金5串5", 8014, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_6 = new PlayType("固定奖金5串6", 8015, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_10 = new PlayType("固定奖金5串10", 8016, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_16 = new PlayType("固定奖金5串16", 8017, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_20 = new PlayType("固定奖金5串20", 8018, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_5_26 = new PlayType("固定奖金5串26", 8019, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_6 = new PlayType("固定奖金6串6", 8020, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_7 = new PlayType("固定奖金6串7", 8021, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_15 = new PlayType("固定奖金6串15", 8022, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_20 = new PlayType("固定奖金6串20", 8023, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_22 = new PlayType("固定奖金6串22", 8024, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_35 = new PlayType("固定奖金6串35", 8025, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_42 = new PlayType("固定奖金6串42", 8026, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_50 = new PlayType("固定奖金6串50", 8027, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_6_57 = new PlayType("固定奖金6串57", 8028, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_7_1 = new PlayType("固定奖金7串1", 8029, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_1 = new PlayType("固定奖金8串1", 8030, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_7_7 = new PlayType("固定奖金7串7", 8031, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_7_8 = new PlayType("固定奖金7串8", 8032, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_7_21 = new PlayType("固定奖金7串21", 8033, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_7_35 = new PlayType("固定奖金7串35", 8034, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_7_120 = new PlayType("固定奖金7串120", 8035, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_8 = new PlayType("固定奖金8串8", 8036, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_9 = new PlayType("固定奖金8串9", 8037, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_28 = new PlayType("固定奖金8串28", 8038, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_56 = new PlayType("固定奖金8串56", 8039, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_70 = new PlayType("固定奖金8串70", 8040, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_8_247 = new PlayType("固定奖金8串247", 8041, LotteryType.JCZQ_SPF);
	public static final PlayType JCZQ_SPF_GD_1 = new PlayType("固定奖金单关", 8042, LotteryType.JCZQ_SPF);

	public static final PlayType JCZQ_SPF_WRQ_GD = new PlayType("固定奖金", 8500, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_FD = new PlayType("浮动奖金", 8501, LotteryType.JCZQ_SPF_WRQ);
	
	public static final PlayType JCZQ_SPF_WRQ_FD_1 = new PlayType("浮动奖金单关", 8502, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_2_1 = new PlayType("固定奖金2串1", 8503, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_3_1 = new PlayType("固定奖金3串1", 8504, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_4_1 = new PlayType("固定奖金4串1", 8505, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_1 = new PlayType("固定奖金5串1", 8506, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_1 = new PlayType("固定奖金6串1", 8507, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_3_3 = new PlayType("固定奖金3串3", 8508, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_3_4 = new PlayType("固定奖金3串4", 8509, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_4_4 = new PlayType("固定奖金4串4", 8510, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_4_5 = new PlayType("固定奖金4串5", 8511, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_4_6 = new PlayType("固定奖金4串6", 8512, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_4_11 = new PlayType("固定奖金4串11", 8513, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_5 = new PlayType("固定奖金5串5", 8514, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_6 = new PlayType("固定奖金5串6", 8515, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_10 = new PlayType("固定奖金5串10", 8516, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_16 = new PlayType("固定奖金5串16", 8517, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_20 = new PlayType("固定奖金5串20", 8518, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_5_26 = new PlayType("固定奖金5串26", 8519, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_6 = new PlayType("固定奖金6串6", 8520, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_7 = new PlayType("固定奖金6串7", 8521, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_15 = new PlayType("固定奖金6串15", 8522, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_20 = new PlayType("固定奖金6串20", 8523, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_22 = new PlayType("固定奖金6串22", 8524, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_35 = new PlayType("固定奖金6串35", 8525, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_42 = new PlayType("固定奖金6串42", 8526, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_50 = new PlayType("固定奖金6串50", 8527, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_6_57 = new PlayType("固定奖金6串57", 8528, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_7_1 = new PlayType("固定奖金7串1", 8529, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_1 = new PlayType("固定奖金8串1", 8530, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_7_7 = new PlayType("固定奖金7串7", 8531, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_7_8 = new PlayType("固定奖金7串8", 8532, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_7_21 = new PlayType("固定奖金7串21", 8533, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_7_35 = new PlayType("固定奖金7串35", 8534, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_7_120 = new PlayType("固定奖金7串120", 8535, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_8 = new PlayType("固定奖金8串8", 8536, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_9 = new PlayType("固定奖金8串9", 8537, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_28 = new PlayType("固定奖金8串28", 8538, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_56 = new PlayType("固定奖金8串56", 8539, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_70 = new PlayType("固定奖金8串70", 8540, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_8_247 = new PlayType("固定奖金8串247", 8541, LotteryType.JCZQ_SPF_WRQ);
	public static final PlayType JCZQ_SPF_WRQ_GD_1 = new PlayType("固定奖金单关", 8542, LotteryType.JCZQ_SPF_WRQ);

	public static final PlayType JCZQ_BF_GD = new PlayType("固定奖金", 8100, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_FD = new PlayType("浮动奖金", 8101, LotteryType.JCZQ_BF);
	
	public static final PlayType JCZQ_BF_FD_1 = new PlayType("单关", 8102, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_2_1 = new PlayType("固定奖金2串1", 8103, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_3_1 = new PlayType("固定奖金3串1", 8104, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_3_3 = new PlayType("固定奖金3串3", 8105, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_3_4 = new PlayType("固定奖金3串4", 8106, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_4_1 = new PlayType("固定奖金4串1", 8107, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_4_4 = new PlayType("固定奖金4串4", 8108, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_4_5 = new PlayType("固定奖金4串5", 8109, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_4_6 = new PlayType("固定奖金4串6", 8110, LotteryType.JCZQ_BF);
	public static final PlayType JCZQ_BF_GD_4_11 = new PlayType("固定奖金4串11", 8111, LotteryType.JCZQ_BF);
	
	public static final PlayType JCZQ_JQS_GD = new PlayType("固定奖金", 8200, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_FD = new PlayType("浮动奖金", 8201, LotteryType.JCZQ_JQS);
	
	public static final PlayType JCZQ_JQS_FD_1 = new PlayType("浮动奖金单关", 8202, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_2_1 = new PlayType("固定奖金2串1", 8203, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_3_1 = new PlayType("固定奖金3串1", 8204, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_4_1 = new PlayType("固定奖金4串1", 8205, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_1 = new PlayType("固定奖金5串1", 8206, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_1 = new PlayType("固定奖金6串1", 8207, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_3_3 = new PlayType("固定奖金3串3", 8208, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_3_4 = new PlayType("固定奖金3串4", 8209, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_4_4 = new PlayType("固定奖金4串4", 8210, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_4_5 = new PlayType("固定奖金4串5", 8211, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_4_6 = new PlayType("固定奖金4串6", 8212, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_4_11 = new PlayType("固定奖金4串11", 8213, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_5 = new PlayType("固定奖金5串5", 8214, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_6 = new PlayType("固定奖金5串6", 8215, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_10 = new PlayType("固定奖金5串10", 8216, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_16 = new PlayType("固定奖金5串16", 8217, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_20 = new PlayType("固定奖金5串20", 8218, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_5_26 = new PlayType("固定奖金5串26", 8219, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_6 = new PlayType("固定奖金6串6", 8220, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_7 = new PlayType("固定奖金6串7", 8221, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_15 = new PlayType("固定奖金6串15", 8222, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_20 = new PlayType("固定奖金6串20", 8223, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_22 = new PlayType("固定奖金6串22", 8224, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_35 = new PlayType("固定奖金6串35", 8225, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_42 = new PlayType("固定奖金6串42", 8226, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_50 = new PlayType("固定奖金6串50", 8227, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_6_57 = new PlayType("固定奖金6串57", 8228, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_7_1 = new PlayType("固定奖金7串1", 8229, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_1 = new PlayType("固定奖金8串1", 8230, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_7_7 = new PlayType("固定奖金7串7", 8231, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_7_8 = new PlayType("固定奖金7串8", 8232, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_7_21 = new PlayType("固定奖金7串21", 8233, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_7_35 = new PlayType("固定奖金7串35", 8234, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_7_120 = new PlayType("固定奖金7串120", 8235, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_8 = new PlayType("固定奖金8串8", 8236, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_9 = new PlayType("固定奖金8串9", 8237, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_28 = new PlayType("固定奖金8串28", 8238, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_56 = new PlayType("固定奖金8串56", 8239, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_70 = new PlayType("固定奖金8串70", 8240, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_8_247 = new PlayType("固定奖金8串247", 8241, LotteryType.JCZQ_JQS);
	public static final PlayType JCZQ_JQS_GD_1 = new PlayType("固定奖金单关", 8242, LotteryType.JCZQ_JQS);

	public static final PlayType JCZQ_BQC_GD = new PlayType("固定奖金", 8300, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_FD = new PlayType("浮动奖金", 8301, LotteryType.JCZQ_BQC);
	
	public static final PlayType JCZQ_BQC_FD_1 = new PlayType("浮动奖金单关", 8302, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_2_1 = new PlayType("固定奖金2串1", 8303, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_3_1 = new PlayType("固定奖金3串1", 8304, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_3_3 = new PlayType("固定奖金3串3", 8305, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_3_4 = new PlayType("固定奖金3串4", 8306, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_4_1 = new PlayType("固定奖金4串1", 8307, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_4_4 = new PlayType("固定奖金4串4", 8308, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_4_5 = new PlayType("固定奖金4串5", 8309, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_4_6 = new PlayType("固定奖金4串6", 8310, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_4_11 = new PlayType("固定奖金4串11", 8311, LotteryType.JCZQ_BQC);
	public static final PlayType JCZQ_BQC_GD_1 = new PlayType("固定奖金单关", 8312, LotteryType.JCZQ_BQC);

	public static final PlayType JCZQ_HHGG_ZYGG = new PlayType("自由过关", 8400, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_ZHGG = new PlayType("组合过关", 8401, LotteryType.JCZQ_HHGG);
	
	public static final PlayType JCZQ_HHGG_DG = new PlayType("混合过关单关", 8402, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_2_1 = new PlayType("2串1", 8403, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_3_1 = new PlayType("3串1", 8404, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_4_1 = new PlayType("4串1", 8405, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_5_1 = new PlayType("5串1", 8406, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_6_1 = new PlayType("6串1", 8407, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_7_1 = new PlayType("7串1", 8408, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_DAN_8_1 = new PlayType("8串1", 8409, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_2_1 = new PlayType("去除单一玩法2串1", 8410, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_3_1 = new PlayType("去除单一玩法3串1", 8411, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_4_1 = new PlayType("去除单一玩法4串1", 8412, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_5_1 = new PlayType("去除单一玩法5串1", 8413, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_6_1 = new PlayType("去除单一玩法6串1", 8414, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_7_1 = new PlayType("去除单一玩法7串1", 8415, LotteryType.JCZQ_HHGG);
	public static final PlayType JCZQ_HHGG_8_1 = new PlayType("去除单一玩法8串1", 8416, LotteryType.JCZQ_HHGG);

    public static final PlayType JCZQ_HHDG_ZYGG = new PlayType("自由单关", 8600, LotteryType.JCZQ_HHDG);

    public static final PlayType JCZQ_HHDG_SPF = new PlayType("混合单关让球胜平负", 8601, LotteryType.JCZQ_HHDG);
    public static final PlayType JCZQ_HHDG_BF = new PlayType("混合单关比分", 8602, LotteryType.JCZQ_HHDG);
    public static final PlayType JCZQ_HHDG_JQS = new PlayType("混合单关进球数", 8603, LotteryType.JCZQ_HHDG);
    public static final PlayType JCZQ_HHDG_BQC = new PlayType("混合单关半全场", 8604, LotteryType.JCZQ_HHDG);
    public static final PlayType JCZQ_HHDG_WRQ_SPF = new PlayType("混合单关胜平负", 8605, LotteryType.JCZQ_HHDG);
}
