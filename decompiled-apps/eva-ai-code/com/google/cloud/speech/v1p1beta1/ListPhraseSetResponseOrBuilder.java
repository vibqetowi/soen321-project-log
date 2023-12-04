package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface ListPhraseSetResponseOrBuilder extends MessageOrBuilder {
    String getNextPageToken();

    ByteString getNextPageTokenBytes();

    PhraseSet getPhraseSets(int i);

    int getPhraseSetsCount();

    List<PhraseSet> getPhraseSetsList();

    PhraseSetOrBuilder getPhraseSetsOrBuilder(int i);

    List<? extends PhraseSetOrBuilder> getPhraseSetsOrBuilderList();
}
