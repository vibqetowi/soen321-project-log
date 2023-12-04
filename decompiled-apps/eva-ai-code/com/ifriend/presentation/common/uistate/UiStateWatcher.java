package com.ifriend.presentation.common.uistate;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: UiStateWatcher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB#\b\u0002\u0012\u001a\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00028\u0000¢\u0006\u0002\u0010\rR\u0012\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\"\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/uistate/UiStateWatcher;", ExifInterface.GPS_DIRECTION_TRUE, "", "watchers", "", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher$Watcher;", "(Ljava/util/List;)V", "lastUiState", "Ljava/lang/Object;", "clear", "", "render", "newUiState", "(Ljava/lang/Object;)V", "Builder", "Watcher", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiStateWatcher<T> {
    public static final int $stable = 8;
    private T lastUiState;
    private final List<Watcher<T, Object>> watchers;

    public /* synthetic */ UiStateWatcher(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    private UiStateWatcher(List<Watcher<T, Object>> list) {
        this.watchers = list;
    }

    public final void render(T t) {
        T t2 = this.lastUiState;
        Iterator<T> it = this.watchers.iterator();
        while (it.hasNext()) {
            Watcher watcher = (Watcher) it.next();
            Function1 property = watcher.getProperty();
            Object invoke = property.invoke(t);
            if (t2 == null || ((Boolean) watcher.getDiffStrategy().invoke(property.invoke(t2), invoke)).booleanValue()) {
                watcher.getCallback().invoke(invoke);
            }
        }
        this.lastUiState = t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UiStateWatcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BQ\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00070\u0005\u0012\"\u0010\b\u001a\u001e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0002`\u000b¢\u0006\u0002\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR-\u0010\b\u001a\u001e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0002`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ifriend/presentation/common/uistate/UiStateWatcher$Watcher;", ExifInterface.GPS_DIRECTION_TRUE, "R", "", "property", "Lkotlin/Function1;", "callback", "", "diffStrategy", "Lkotlin/Function2;", "", "Lcom/ifriend/presentation/common/uistate/DiffStrategy;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "getDiffStrategy", "()Lkotlin/jvm/functions/Function2;", "getProperty", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Watcher<T, R> {
        private final Function1<R, Unit> callback;
        private final Function2<R, R, Boolean> diffStrategy;
        private final Function1<T, R> property;

        /* JADX WARN: Multi-variable type inference failed */
        public Watcher(Function1<? super T, ? extends R> property, Function1<? super R, Unit> callback, Function2<? super R, ? super R, Boolean> diffStrategy) {
            Intrinsics.checkNotNullParameter(property, "property");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(diffStrategy, "diffStrategy");
            this.property = property;
            this.callback = callback;
            this.diffStrategy = diffStrategy;
        }

        public final Function1<T, R> getProperty() {
            return this.property;
        }

        public final Function1<R, Unit> getCallback() {
            return this.callback;
        }

        public final Function2<R, R, Boolean> getDiffStrategy() {
            return this.diffStrategy;
        }
    }

    public final void clear() {
        this.lastUiState = null;
    }

    /* compiled from: UiStateWatcher.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0007\b\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0001JZ\u0010\t\u001a\u00020\n\"\u0004\b\u0002\u0010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u000b0\r2\"\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u0002H\u000b`\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\rH\u0002J3\u0010\u0013\u001a\u00020\n\"\u0004\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u000b0\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\rH\u0086\u0002Jw\u0010\u0013\u001a6\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u0002H\u000b`\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\r0\u0014\"\u0004\b\u0002\u0010\u000b*\u001e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u0002H\u000b`\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\n0\rH\u0086\u0002R\"\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/common/uistate/UiStateWatcher$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "watchers", "", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher$Watcher;", "build", "Lcom/ifriend/presentation/common/uistate/UiStateWatcher;", "watch", "", "R", "property", "Lkotlin/Function1;", "diffStrategy", "Lkotlin/Function2;", "", "Lcom/ifriend/presentation/common/uistate/DiffStrategy;", "callback", "invoke", "Lkotlin/Pair;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder<T> {
        public static final int $stable = 8;
        private final List<Watcher<T, Object>> watchers = new ArrayList();

        private final <R> void watch(Function1<? super T, ? extends R> function1, Function2<? super R, ? super R, Boolean> function2, Function1<? super R, Unit> function12) {
            this.watchers.add(new Watcher<>(function1, function12, function2));
        }

        public final <R> void invoke(Function1<? super T, ? extends R> function1, Function1<? super R, Unit> callback) {
            Intrinsics.checkNotNullParameter(function1, "<this>");
            Intrinsics.checkNotNullParameter(callback, "callback");
            watch(function1, UiStateWatcherKt.byValue(), callback);
        }

        public final <R> Pair<Function2<R, R, Boolean>, Function1<R, Unit>> invoke(Function2<? super R, ? super R, Boolean> function2, Function1<? super R, Unit> callback) {
            Intrinsics.checkNotNullParameter(function2, "<this>");
            Intrinsics.checkNotNullParameter(callback, "callback");
            return TuplesKt.to(function2, callback);
        }

        public final UiStateWatcher<T> build() {
            return new UiStateWatcher<>(this.watchers, null);
        }
    }
}
