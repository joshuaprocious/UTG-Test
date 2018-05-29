package org.hl7.fhir.utilities.graphql;

public class NameValue extends Value {
  private String value;

  public NameValue(java.lang.String value) {
    super();
    this.value = value;
  }

  public NameValue(boolean asBoolean) {
    super();
    if (asBoolean) 
      this.value = "true";
    else
      this.value = "false";
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public void write(StringBuilder b, int indent) {
    b.append(value);      
  }

  public boolean isValue(String v) {
    return v.equals(value);      
  }

  public String toString() {
    return value;
  }
}