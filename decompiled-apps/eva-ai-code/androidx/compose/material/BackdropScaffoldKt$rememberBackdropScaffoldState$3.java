package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: BackdropScaffold.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/BackdropScaffoldState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$rememberBackdropScaffoldState$3 extends Lambda implements Function0<BackdropScaffoldState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ Function1<BackdropValue, Boolean> $confirmStateChange;
    final /* synthetic */ BackdropValue $initialValue;
    final /* synthetic */ SnackbarHostState $snackbarHostState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackdropScaffoldKt$rememberBackdropScaffoldState$3(BackdropValue backdropValue, AnimationSpec<Float> animationSpec, Function1<? super BackdropValue, Boolean> function1, SnackbarHostState snackbarHostState) {
        super(0);
        this.$initialValue = backdropValue;
        this.$animationSpec = animationSpec;
        this.$confirmStateChange = function1;
        this.$snackbarHostState = snackbarHostState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BackdropScaffoldState invoke() {
        return new BackdropScaffoldState(this.$initialValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
