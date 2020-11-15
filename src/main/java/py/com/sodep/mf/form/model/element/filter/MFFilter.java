package py.com.sodep.mf.form.model.element.filter;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class MFFilter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7287683851745247359L;

	public enum Type {
		DEFAULT_VALUE, ITEM_LIST
	}

	public enum Operator {
		EQUALS, CONTAINS, DISTINCT, GREATER_THAN, LESS_THAN
	}

	private Type type;

	private String column;

	private Operator operator;

	private String RightValue;

	private int index;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}

	public String getRightValue() {
		return RightValue;
	}

	public void setRightValue(String rightValue) {
		RightValue = rightValue;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
