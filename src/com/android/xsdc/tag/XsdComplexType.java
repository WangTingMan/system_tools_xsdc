package com.android.xsdc.tag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class XsdComplexType extends XsdType {
    final private XsdType base;
    final private List<XsdAttribute> attributes;
    final private List<XsdElement> elements;

    XsdComplexType(String name, XsdType base, List<XsdAttribute> attributes,
            List<XsdElement> elements) {
        super(name, null);
        this.base = base;
        this.attributes = Collections.unmodifiableList(
                attributes != null ? attributes : new ArrayList<>());
        this.elements = Collections.unmodifiableList(
                elements != null ? elements : new ArrayList<>());
    }

    public XsdType getBase() {
        return base;
    }

    public List<XsdAttribute> getAttributes() {
        return attributes;
    }

    public List<XsdElement> getElements() {
        return elements;
    }
}
