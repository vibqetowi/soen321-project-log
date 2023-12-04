package com.google.cloud.speech.v1p1beta1;

import com.google.cloud.speech.v1p1beta1.PhraseSet;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface PhraseSetOrBuilder extends MessageOrBuilder {
    float getBoost();

    String getName();

    ByteString getNameBytes();

    PhraseSet.Phrase getPhrases(int i);

    int getPhrasesCount();

    List<PhraseSet.Phrase> getPhrasesList();

    PhraseSet.PhraseOrBuilder getPhrasesOrBuilder(int i);

    List<? extends PhraseSet.PhraseOrBuilder> getPhrasesOrBuilderList();
}
