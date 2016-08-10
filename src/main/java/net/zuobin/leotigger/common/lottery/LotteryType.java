package net.zuobin.leotigger.common.lottery;

import net.zuobin.leotigger.common.define.IntegerBeanLabelItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotteryType extends IntegerBeanLabelItem {
	private static final Logger logger = LoggerFactory.getLogger(LotteryType.class.getName());
	private static final long serialVersionUID = 5959923813363953414L;
	
	private static List<LotteryType> _items = new ArrayList<LotteryType>();
	
	private static List<LotteryType> items;

	protected LotteryType(String name, int value) {
		super(LotteryType.class.getName(), name, value);
		_items.add(this);
	}
	
	public static LotteryType getItem(int value){
		try {
			return (LotteryType)LotteryType.getResult(LotteryType.class.getName(), value);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return null;
		}
	}
	
	/**
	 * @return 所有彩种的列表
	 */
	public static List<LotteryType> getItems() {
		return items;
	}

	public static Logger getLogger(LotteryType lotteryType) {
		return LoggerFactory.getLogger("process_" + lotteryType.getValue());
	}

	// 竞彩足球
	public final static LotteryType JCZQ_SPF = new LotteryType("让球胜平负", 80);
	public final static LotteryType JCZQ_BF = new LotteryType("全场比分", 81);
	public final static LotteryType JCZQ_JQS = new LotteryType("进球数", 82);
	public final static LotteryType JCZQ_BQC = new LotteryType("半全场胜平负", 83);
	public final static LotteryType JCZQ_HHGG = new LotteryType("混合过关", 84);
	public final static LotteryType JCZQ_SPF_WRQ = new LotteryType("胜平负", 85);
    public final static LotteryType JCZQ_HHDG = new LotteryType("混合单关", 86);

	static {
		synchronized (_items) {
			items = Collections.unmodifiableList(_items);
		}
	}
}

