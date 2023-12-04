package com.google.api;

import com.google.api.ResourceDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface ResourceDescriptorOrBuilder extends MessageOrBuilder {
    ResourceDescriptor.History getHistory();

    int getHistoryValue();

    String getNameField();

    ByteString getNameFieldBytes();

    String getPattern(int i);

    ByteString getPatternBytes(int i);

    int getPatternCount();

    List<String> getPatternList();

    String getPlural();

    ByteString getPluralBytes();

    String getSingular();

    ByteString getSingularBytes();

    ResourceDescriptor.Style getStyle(int i);

    int getStyleCount();

    List<ResourceDescriptor.Style> getStyleList();

    int getStyleValue(int i);

    List<Integer> getStyleValueList();

    String getType();

    ByteString getTypeBytes();
}
