package weixin.popular.bean.paymch;

import java.util.List;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.alibaba.fastjson.JSON;

public class PromotionDetailXmlAdapter extends XmlAdapter<String, List<PromotionDetail>> {

	@Override
	public List<PromotionDetail> unmarshal(String v) throws Exception {
		return JSON.parseArray(v, PromotionDetail.class);
	}

	@Override
	public String marshal(List<PromotionDetail> v) throws Exception {
		return "<![CDATA[" + JSON.toJSONString(v) + "]]>";
	}
}
