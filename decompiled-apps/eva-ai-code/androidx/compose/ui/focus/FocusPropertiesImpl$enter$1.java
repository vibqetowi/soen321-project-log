package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FocusProperties.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/focus/FocusRequester;", "it", "Landroidx/compose/ui/focus/FocusDirection;", "invoke-3ESFkO8", "(I)Landroidx/compose/ui/focus/FocusRequester;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusPropertiesImpl$enter$1 extends Lambda implements Function1<FocusDirection, FocusRequester> {
    public static final FocusPropertiesImpl$enter$1 INSTANCE = new FocusPropertiesImpl$enter$1();

    FocusPropertiesImpl$enter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ FocusRequester invoke(FocusDirection focusDirection) {
        return m2962invoke3ESFkO8(focusDirection.m2940unboximpl());
    }

    /* renamed from: invoke-3ESFkO8  reason: not valid java name */
    public final FocusRequester m2962invoke3ESFkO8(int i) {
        return FocusRequester.Companion.getDefault();
    }
}
