package com.ifriend.data.config.parser;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.ifriend.domain.config.ConfigEntity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
/* compiled from: FirebaseRemoteConfigParser.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/ifriend/data/config/parser/FirebaseRemoteConfigParser;", "", "parse", "", "Lcom/ifriend/domain/config/ConfigEntity;", "config", "", "", "Lcom/google/firebase/remoteconfig/FirebaseRemoteConfigValue;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FirebaseRemoteConfigParser {
    Object parse(Map<String, ? extends FirebaseRemoteConfigValue> map, Continuation<? super List<ConfigEntity>> continuation);
}
