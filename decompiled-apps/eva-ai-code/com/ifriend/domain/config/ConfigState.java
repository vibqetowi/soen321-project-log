package com.ifriend.domain.config;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: Config.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0016\u0017\u0018J'\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016J\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0096\u0002\u0082\u0001\u0003\u0019\u001a\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ifriend/domain/config/ConfigState;", "", "firstOrNull", "Lcom/ifriend/domain/config/ConfigEntity;", "predicate", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDoubleFeature", "", "key", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEntities", "", "getFeature", "getLongFeature", "", "getStringFeature", "has", "plus", "missingConfig", "Error", "Loaded", "Loading", "Lcom/ifriend/domain/config/ConfigState$Error;", "Lcom/ifriend/domain/config/ConfigState$Loaded;", "Lcom/ifriend/domain/config/ConfigState$Loading;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ConfigState {
    Object firstOrNull(Function1<? super ConfigEntity, Boolean> function1, Continuation<? super ConfigEntity> continuation);

    Object getDoubleFeature(String str, Continuation<? super Double> continuation);

    List<ConfigEntity> getEntities();

    Object getFeature(String str, Continuation<? super Boolean> continuation);

    Object getLongFeature(String str, Continuation<? super Long> continuation);

    Object getStringFeature(String str, Continuation<? super String> continuation);

    Object has(String str, Continuation<? super Boolean> continuation);

    ConfigState plus(List<ConfigEntity> list);

    /* compiled from: Config.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/ifriend/domain/config/ConfigState$Loading;", "Lcom/ifriend/domain/config/ConfigState;", "()V", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Loading implements ConfigState {
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object firstOrNull(Function1<? super ConfigEntity, Boolean> function1, Continuation<? super ConfigEntity> continuation) {
            return DefaultImpls.firstOrNull(this, function1, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getDoubleFeature(String str, Continuation<? super Double> continuation) {
            return DefaultImpls.getDoubleFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public List<ConfigEntity> getEntities() {
            return DefaultImpls.getEntities(this);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getFeature(String str, Continuation<? super Boolean> continuation) {
            return DefaultImpls.getFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getLongFeature(String str, Continuation<? super Long> continuation) {
            return DefaultImpls.getLongFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getStringFeature(String str, Continuation<? super String> continuation) {
            return DefaultImpls.getStringFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object has(String str, Continuation<? super Boolean> continuation) {
            return DefaultImpls.has(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public ConfigState plus(List<ConfigEntity> list) {
            return DefaultImpls.plus(this, list);
        }
    }

    /* compiled from: Config.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ifriend/domain/config/ConfigState$Error;", "Lcom/ifriend/domain/config/ConfigState;", "error", "", "(Ljava/lang/Throwable;)V", "errors", "", "(Ljava/util/List;)V", "getErrors", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Error implements ConfigState {
        private final List<Throwable> errors;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Error copy$default(Error error, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = error.errors;
            }
            return error.copy(list);
        }

        public final List<Throwable> component1() {
            return this.errors;
        }

        public final Error copy(List<? extends Throwable> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            return new Error(errors);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.areEqual(this.errors, ((Error) obj).errors);
        }

        public int hashCode() {
            return this.errors.hashCode();
        }

        public String toString() {
            List<Throwable> list = this.errors;
            return "Error(errors=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Error(List<? extends Throwable> errors) {
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.errors = errors;
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object firstOrNull(Function1<? super ConfigEntity, Boolean> function1, Continuation<? super ConfigEntity> continuation) {
            return DefaultImpls.firstOrNull(this, function1, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getDoubleFeature(String str, Continuation<? super Double> continuation) {
            return DefaultImpls.getDoubleFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public List<ConfigEntity> getEntities() {
            return DefaultImpls.getEntities(this);
        }

        public final List<Throwable> getErrors() {
            return this.errors;
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getFeature(String str, Continuation<? super Boolean> continuation) {
            return DefaultImpls.getFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getLongFeature(String str, Continuation<? super Long> continuation) {
            return DefaultImpls.getLongFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getStringFeature(String str, Continuation<? super String> continuation) {
            return DefaultImpls.getStringFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object has(String str, Continuation<? super Boolean> continuation) {
            return DefaultImpls.has(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public ConfigState plus(List<ConfigEntity> list) {
            return DefaultImpls.plus(this, list);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Error(Throwable error) {
            this(CollectionsKt.listOf(error));
            Intrinsics.checkNotNullParameter(error, "error");
        }
    }

    /* compiled from: Config.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ifriend/domain/config/ConfigState$Loaded;", "Lcom/ifriend/domain/config/ConfigState;", "config", "", "Lcom/ifriend/domain/config/ConfigEntity;", "(Ljava/util/List;)V", "getConfig", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Loaded implements ConfigState {
        private final List<ConfigEntity> config;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = loaded.config;
            }
            return loaded.copy(list);
        }

        public final List<ConfigEntity> component1() {
            return this.config;
        }

        public final Loaded copy(List<ConfigEntity> config) {
            Intrinsics.checkNotNullParameter(config, "config");
            return new Loaded(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && Intrinsics.areEqual(this.config, ((Loaded) obj).config);
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            List<ConfigEntity> list = this.config;
            return "Loaded(config=" + list + ")";
        }

        public Loaded(List<ConfigEntity> config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.config = config;
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object firstOrNull(Function1<? super ConfigEntity, Boolean> function1, Continuation<? super ConfigEntity> continuation) {
            return DefaultImpls.firstOrNull(this, function1, continuation);
        }

        public final List<ConfigEntity> getConfig() {
            return this.config;
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getDoubleFeature(String str, Continuation<? super Double> continuation) {
            return DefaultImpls.getDoubleFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public List<ConfigEntity> getEntities() {
            return DefaultImpls.getEntities(this);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getFeature(String str, Continuation<? super Boolean> continuation) {
            return DefaultImpls.getFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getLongFeature(String str, Continuation<? super Long> continuation) {
            return DefaultImpls.getLongFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object getStringFeature(String str, Continuation<? super String> continuation) {
            return DefaultImpls.getStringFeature(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public Object has(String str, Continuation<? super Boolean> continuation) {
            return DefaultImpls.has(this, str, continuation);
        }

        @Override // com.ifriend.domain.config.ConfigState
        public ConfigState plus(List<ConfigEntity> list) {
            return DefaultImpls.plus(this, list);
        }
    }

    /* compiled from: Config.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static Object has(ConfigState configState, String str, Continuation<? super Boolean> continuation) {
            return Boxing.boxBoolean(configState instanceof Loaded ? AppconfigKt.has(((Loaded) configState).getConfig(), str) : false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static Object firstOrNull(ConfigState configState, Function1<? super ConfigEntity, Boolean> function1, Continuation<? super ConfigEntity> continuation) {
            Object obj = null;
            if (configState instanceof Loaded) {
                Iterator it = ((Loaded) configState).getConfig().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (function1.invoke(next).booleanValue()) {
                        obj = next;
                        break;
                    }
                }
                return (ConfigEntity) obj;
            }
            return null;
        }

        public static Object getFeature(ConfigState configState, String str, Continuation<? super Boolean> continuation) {
            if (configState instanceof Loaded) {
                return AppconfigKt.getFeature(((Loaded) configState).getConfig(), str);
            }
            return null;
        }

        public static Object getLongFeature(ConfigState configState, String str, Continuation<? super Long> continuation) {
            if (configState instanceof Loaded) {
                return AppconfigKt.getLongFeature(((Loaded) configState).getConfig(), str);
            }
            return null;
        }

        public static Object getStringFeature(ConfigState configState, String str, Continuation<? super String> continuation) {
            if (configState instanceof Loaded) {
                return AppconfigKt.getStringFeature(((Loaded) configState).getConfig(), str);
            }
            return null;
        }

        public static Object getDoubleFeature(ConfigState configState, String str, Continuation<? super Double> continuation) {
            if (configState instanceof Loaded) {
                return AppconfigKt.getDoubleFeature(((Loaded) configState).getConfig(), str);
            }
            return null;
        }

        public static List<ConfigEntity> getEntities(ConfigState configState) {
            return configState instanceof Loaded ? ((Loaded) configState).getConfig() : CollectionsKt.emptyList();
        }

        public static ConfigState plus(ConfigState configState, List<ConfigEntity> missingConfig) {
            Intrinsics.checkNotNullParameter(missingConfig, "missingConfig");
            return configState instanceof Loaded ? new Loaded(CollectionsKt.plus((Collection) ((Loaded) configState).getConfig(), (Iterable) missingConfig)) : configState;
        }
    }
}
