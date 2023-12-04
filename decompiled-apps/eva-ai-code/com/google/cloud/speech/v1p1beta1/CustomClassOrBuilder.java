package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.CustomClass;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface CustomClassOrBuilder extends MessageOrBuilder {
    String getCustomClassId();

    ByteString getCustomClassIdBytes();

    CustomClass.ClassItem getItems(int i);

    int getItemsCount();

    List<CustomClass.ClassItem> getItemsList();

    CustomClass.ClassItemOrBuilder getItemsOrBuilder(int i);

    List<? extends CustomClass.ClassItemOrBuilder> getItemsOrBuilderList();

    String getName();

    ByteString getNameBytes();
}
