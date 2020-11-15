package py.com.sodep.mf.form.model.element;

import java.util.List;

import py.com.sodep.mf.form.model.IPositionable;
import py.com.sodep.mf.form.model.MFBaseModel;
import py.com.sodep.mf.form.model.element.filter.MFFilter;
import py.com.sodep.mf.form.model.prototype.MFPrototype;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

// Corresponds to an ElementInstance
//TODO consider Subclassing MFElement to 2 classes
// one that's meant for output elements (Headline, InfoPhoto) and
// other that's meant for input elements (Input, Select, Photo, etc.)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFElement extends MFBaseModel implements IPositionable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MFPrototype proto;

	private int position;

	private boolean required;

	private boolean visible = true;

	private Long defaultValueLookupTableId;

	private String defaultValueColumn;

	private List<MFFilter> defaultValueFilters;

	private List<MFFilter> itemListFilters;

	private String instanceId;

	/**
	 * It's called proto to avoid confusion/conflicts with javascript functions'
	 * property prototype
	 * 
	 * @return
	 */
	public MFPrototype getProto() {
		return proto;
	}

	public void setProto(MFPrototype proto) {
		this.proto = proto;
	}

	@Override
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getDefaultValueColumn() {
		return defaultValueColumn;
	}

	public void setDefaultValueColumn(String defaultValueColumn) {
		this.defaultValueColumn = defaultValueColumn;
	}

	public Long getDefaultValueLookupTableId() {
		return defaultValueLookupTableId;
	}

	public void setDefaultValueLookupTableId(Long defaultValueLookupTableId) {
		this.defaultValueLookupTableId = defaultValueLookupTableId;
	}

	/**
	 * Applicable only to Elements that input data
	 * 
	 * @return
	 */
	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public List<MFFilter> getDefaultValueFilters() {
		return defaultValueFilters;
	}

	public void setDefaultValueFilters(List<MFFilter> defaultValueFilters) {
		this.defaultValueFilters = defaultValueFilters;
	}

	public List<MFFilter> getItemListFilters() {
		return itemListFilters;
	}

	public void setItemListFilters(List<MFFilter> itemListFilters) {
		this.itemListFilters = itemListFilters;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	@Override
	public Type getType() {
		return MFBaseModel.Type.ELEMENT;
	}

}
