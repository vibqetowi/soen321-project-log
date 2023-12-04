package com.google.api;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;
/* loaded from: classes7.dex */
public interface BackendOrBuilder extends MessageOrBuilder {
    BackendRule getRules(int i);

    int getRulesCount();

    List<BackendRule> getRulesList();

    BackendRuleOrBuilder getRulesOrBuilder(int i);

    List<? extends BackendRuleOrBuilder> getRulesOrBuilderList();
}
