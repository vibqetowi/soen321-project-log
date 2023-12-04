package com.google.cloud.speech.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface SpeechContextOrBuilder extends MessageOrBuilder {
    String getPhrases(int i);

    ByteString getPhrasesBytes(int i);

    int getPhrasesCount();

    List<String> getPhrasesList();
}
