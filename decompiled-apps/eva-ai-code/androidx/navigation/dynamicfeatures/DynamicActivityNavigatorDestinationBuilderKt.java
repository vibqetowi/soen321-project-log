package androidx.navigation.dynamicfeatures;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DynamicActivityNavigatorDestinationBuilder.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0087\bø\u0001\u0000\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"activity", "", "Landroidx/navigation/dynamicfeatures/DynamicNavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/dynamicfeatures/DynamicActivityNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "route", "", "navigation-dynamic-features-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DynamicActivityNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to build your DynamicActivityDestination instead", replaceWith = @ReplaceWith(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(DynamicNavGraphBuilder dynamicNavGraphBuilder, int i, Function1<? super DynamicActivityNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(dynamicNavGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DynamicActivityNavigatorDestinationBuilder dynamicActivityNavigatorDestinationBuilder = new DynamicActivityNavigatorDestinationBuilder((DynamicActivityNavigator) dynamicNavGraphBuilder.getProvider().getNavigator(DynamicActivityNavigator.class), i);
        builder.invoke(dynamicActivityNavigatorDestinationBuilder);
        dynamicNavGraphBuilder.destination(dynamicActivityNavigatorDestinationBuilder);
    }

    public static final void activity(DynamicNavGraphBuilder dynamicNavGraphBuilder, String route, Function1<? super DynamicActivityNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter(dynamicNavGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        DynamicActivityNavigatorDestinationBuilder dynamicActivityNavigatorDestinationBuilder = new DynamicActivityNavigatorDestinationBuilder((DynamicActivityNavigator) dynamicNavGraphBuilder.getProvider().getNavigator(DynamicActivityNavigator.class), route);
        builder.invoke(dynamicActivityNavigatorDestinationBuilder);
        dynamicNavGraphBuilder.destination(dynamicActivityNavigatorDestinationBuilder);
    }
}
