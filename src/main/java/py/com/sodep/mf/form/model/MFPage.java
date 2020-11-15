package py.com.sodep.mf.form.model;

import java.util.List;

import py.com.sodep.mf.form.model.element.MFElement;
import py.com.sodep.mf.form.model.flow.MFFlow;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFPage extends MFBaseModel implements IPositionable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String label;

	private String description;

	private int position;

	private List<MFElement> elements;

	private boolean saveable;

	private MFFlow flow;

	private String instanceId;

	public List<MFElement> getElements() {
		return elements;
	}

	public void setElements(List<MFElement> elements) {
		this.elements = elements;
	}

	@Override
	public int getPosition() {
		return position;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public MFFlow getFlow() {
		return flow;
	}

	public void setFlow(MFFlow flow) {
		this.flow = flow;
	}

	public boolean isSaveable() {
		return saveable;
	}

	public void setSaveable(boolean saveable) {
		this.saveable = saveable;
	}

	public String getInstanceId() {
		return instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	@Override
	public Type getType() {
		return MFBaseModel.Type.PAGE;
	}

}
