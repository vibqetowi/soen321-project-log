package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.modifier.ModifierLocalReadScope;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00022\u00020\u0003B+\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010 \u001a\u00020\tJ\u0012\u0010 \u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0000H\u0002J\b\u0010\"\u001a\u00020\u0006H\u0002J\u0010\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\tH\u0002J\b\u0010'\u001a\u00020\tH\u0002J\u0006\u0010(\u001a\u00020\u0006J,\u0010)\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R/\u0010\u0016\u001a\u0004\u0018\u00010\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00008B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u0006*"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerIconModifierLocal;", "Landroidx/compose/ui/input/pointer/PointerIcon;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/modifier/ModifierLocalConsumer;", "icon", "overrideDescendants", "", "onSetIcon", "Lkotlin/Function1;", "", "(Landroidx/compose/ui/input/pointer/PointerIcon;ZLkotlin/jvm/functions/Function1;)V", "isHovered", "()Z", "setHovered", "(Z)V", "isPaused", "setPaused", "key", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "<set-?>", "parentInfo", "getParentInfo", "()Landroidx/compose/ui/input/pointer/PointerIconModifierLocal;", "setParentInfo", "(Landroidx/compose/ui/input/pointer/PointerIconModifierLocal;)V", "parentInfo$delegate", "Landroidx/compose/runtime/MutableState;", "value", "getValue", "enter", "exit", "parent", "hasOverride", "onModifierLocalsUpdated", "scope", "Landroidx/compose/ui/modifier/ModifierLocalReadScope;", "pause", "reassignIcon", "shouldUpdatePointerIcon", "updateValues", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PointerIconModifierLocal implements PointerIcon, ModifierLocalProvider<PointerIconModifierLocal>, ModifierLocalConsumer {
    private PointerIcon icon;
    private boolean isHovered;
    private boolean isPaused;
    private final ProvidableModifierLocal<PointerIconModifierLocal> key;
    private Function1<? super PointerIcon, Unit> onSetIcon;
    private boolean overrideDescendants;
    private final MutableState parentInfo$delegate;
    private final PointerIconModifierLocal value;

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return Modifier.Element.CC.$default$all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return Modifier.Element.CC.$default$any(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldIn(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldOut(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public PointerIconModifierLocal(PointerIcon icon, boolean z, Function1<? super PointerIcon, Unit> onSetIcon) {
        MutableState mutableStateOf$default;
        ProvidableModifierLocal<PointerIconModifierLocal> providableModifierLocal;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onSetIcon, "onSetIcon");
        this.icon = icon;
        this.overrideDescendants = z;
        this.onSetIcon = onSetIcon;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentInfo$delegate = mutableStateOf$default;
        providableModifierLocal = PointerIconKt.ModifierLocalPointerIcon;
        this.key = providableModifierLocal;
        this.value = this;
    }

    private final PointerIconModifierLocal getParentInfo() {
        return (PointerIconModifierLocal) this.parentInfo$delegate.getValue();
    }

    private final void setParentInfo(PointerIconModifierLocal pointerIconModifierLocal) {
        this.parentInfo$delegate.setValue(pointerIconModifierLocal);
    }

    public final boolean isPaused() {
        return this.isPaused;
    }

    public final void setPaused(boolean z) {
        this.isPaused = z;
    }

    public final boolean isHovered() {
        return this.isHovered;
    }

    public final void setHovered(boolean z) {
        this.isHovered = z;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public ProvidableModifierLocal<PointerIconModifierLocal> getKey() {
        return this.key;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.modifier.ModifierLocalProvider
    public PointerIconModifierLocal getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(ModifierLocalReadScope scope) {
        ProvidableModifierLocal providableModifierLocal;
        Intrinsics.checkNotNullParameter(scope, "scope");
        PointerIconModifierLocal parentInfo = getParentInfo();
        providableModifierLocal = PointerIconKt.ModifierLocalPointerIcon;
        setParentInfo((PointerIconModifierLocal) scope.getCurrent(providableModifierLocal));
        if (parentInfo == null || getParentInfo() != null) {
            return;
        }
        exit(parentInfo);
        this.onSetIcon = PointerIconModifierLocal$onModifierLocalsUpdated$1$1.INSTANCE;
    }

    public final boolean shouldUpdatePointerIcon() {
        PointerIconModifierLocal parentInfo = getParentInfo();
        return parentInfo == null || !parentInfo.hasOverride();
    }

    private final boolean hasOverride() {
        if (this.overrideDescendants) {
            return true;
        }
        PointerIconModifierLocal parentInfo = getParentInfo();
        return parentInfo != null && parentInfo.hasOverride();
    }

    public final void enter() {
        this.isHovered = true;
        if (this.isPaused) {
            return;
        }
        PointerIconModifierLocal parentInfo = getParentInfo();
        if (parentInfo != null) {
            parentInfo.pause();
        }
        this.onSetIcon.invoke(this.icon);
    }

    public final void exit() {
        exit(getParentInfo());
    }

    private final void exit(PointerIconModifierLocal pointerIconModifierLocal) {
        if (this.isHovered) {
            if (pointerIconModifierLocal == null) {
                this.onSetIcon.invoke(null);
            } else {
                pointerIconModifierLocal.reassignIcon();
            }
        }
        this.isHovered = false;
    }

    private final void reassignIcon() {
        this.isPaused = false;
        if (this.isHovered) {
            this.onSetIcon.invoke(this.icon);
        } else if (getParentInfo() == null) {
            this.onSetIcon.invoke(null);
        } else {
            PointerIconModifierLocal parentInfo = getParentInfo();
            if (parentInfo != null) {
                parentInfo.reassignIcon();
            }
        }
    }

    private final void pause() {
        this.isPaused = true;
        PointerIconModifierLocal parentInfo = getParentInfo();
        if (parentInfo != null) {
            parentInfo.pause();
        }
    }

    public final void updateValues(PointerIcon icon, boolean z, Function1<? super PointerIcon, Unit> onSetIcon) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(onSetIcon, "onSetIcon");
        if (!Intrinsics.areEqual(this.icon, icon) && this.isHovered && !this.isPaused) {
            onSetIcon.invoke(icon);
        }
        this.icon = icon;
        this.overrideDescendants = z;
        this.onSetIcon = onSetIcon;
    }
}
