package com.google.cloud.speech.v1p1beta1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface SpeechAdaptationOrBuilder extends MessageOrBuilder {
    CustomClass getCustomClasses(int i);

    int getCustomClassesCount();

    List<CustomClass> getCustomClassesList();

    CustomClassOrBuilder getCustomClassesOrBuilder(int i);

    List<? extends CustomClassOrBuilder> getCustomClassesOrBuilderList();

    String getPhraseSetReferences(int i);

    ByteString getPhraseSetReferencesBytes(int i);

    int getPhraseSetReferencesCount();

    List<String> getPhraseSetReferencesList();

    PhraseSet getPhraseSets(int i);

    int getPhraseSetsCount();

    List<PhraseSet> getPhraseSetsList();

    PhraseSetOrBuilder getPhraseSetsOrBuilder(int i);

    List<? extends PhraseSetOrBuilder> getPhraseSetsOrBuilderList();
}
