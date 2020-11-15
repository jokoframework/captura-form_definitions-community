package py.com.sodep.mf.form.model.flow;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFConditionalTarget implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3688492127824231586L;

	public static enum Operator {
		EQUALS("equals"), CONTAINS("contains"), DISTINCT("distinct"), GT("greater than"), LT("less than");

		String name;

		Operator(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	public static enum Action {
		SAVE, SAVE_DRAFT,
	}

	private Action preAction;

	private String elementId;

	private Operator operator;

	private String value;

	private String target;

	private int index;

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Action getPreAction() {
		return preAction;
	}

	public void setPreAction(Action preAction) {
		this.preAction = preAction;
	}

	public String getElementId() {
		return elementId;
	}

	public void setElementId(String elementId) {
		this.elementId = elementId;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
