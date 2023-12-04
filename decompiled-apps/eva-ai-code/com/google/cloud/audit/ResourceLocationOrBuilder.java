package com.google.cloud.audit;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface ResourceLocationOrBuilder extends MessageOrBuilder {
    String getCurrentLocations(int i);

    ByteString getCurrentLocationsBytes(int i);

    int getCurrentLocationsCount();

    List<String> getCurrentLocationsList();

    String getOriginalLocations(int i);

    ByteString getOriginalLocationsBytes(int i);

    int getOriginalLocationsCount();

    List<String> getOriginalLocationsList();
}
