package com.google.api;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface ProjectPropertiesOrBuilder extends MessageOrBuilder {
    Property getProperties(int i);

    int getPropertiesCount();

    List<Property> getPropertiesList();

    PropertyOrBuilder getPropertiesOrBuilder(int i);

    List<? extends PropertyOrBuilder> getPropertiesOrBuilderList();
}
