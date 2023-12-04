package com.ifriend.base.navigation.impl;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.ifriend.base.navigation.api.ForwardIfNotInStack;
import com.ifriend.base.navigation.api.TransformCurrentChainCommand;
import com.ifriend.base.navigation.api.cicerone.Command;
import com.ifriend.base.navigation.api.cicerone.Forward;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.base.navigation.impl.cicerone.AppNavigator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ExtendNavigator.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b\u0016\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lcom/ifriend/base/navigation/impl/ExtendNavigator;", "Lcom/ifriend/base/navigation/impl/cicerone/AppNavigator;", "activity", "Landroidx/fragment/app/FragmentActivity;", "containerId", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "(Landroidx/fragment/app/FragmentActivity;ILandroidx/fragment/app/FragmentManager;Landroidx/fragment/app/FragmentFactory;)V", "applyCommand", "", "command", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "forwardIfNotInStack", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "transformCurrentChain", "chain", "", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class ExtendNavigator extends AppNavigator {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendNavigator(FragmentActivity activity, int i) {
        this(activity, i, null, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExtendNavigator(FragmentActivity activity, int i, FragmentManager fragmentManager) {
        this(activity, i, fragmentManager, null, 8, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ExtendNavigator(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager, FragmentFactory fragmentFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, i, fragmentManager, fragmentFactory);
        if ((i2 & 4) != 0) {
            fragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(fragmentManager, "getSupportFragmentManager(...)");
        }
        if ((i2 & 8) != 0) {
            fragmentFactory = fragmentManager.getFragmentFactory();
            Intrinsics.checkNotNullExpressionValue(fragmentFactory, "getFragmentFactory(...)");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendNavigator(FragmentActivity activity, int i, FragmentManager fragmentManager, FragmentFactory fragmentFactory) {
        super(activity, i, fragmentManager, fragmentFactory);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.base.navigation.impl.cicerone.AppNavigator
    public void applyCommand(Command command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (command instanceof TransformCurrentChainCommand) {
            transformCurrentChain(((TransformCurrentChainCommand) command).getChain());
        } else if (command instanceof ForwardIfNotInStack) {
            forwardIfNotInStack(((ForwardIfNotInStack) command).getScreen());
        } else {
            super.applyCommand(command);
        }
    }

    private final void forwardIfNotInStack(Screen screen) {
        if (getLocalStackCopy().contains(screen.getScreenKey())) {
            return;
        }
        forward(new Forward(screen));
    }

    private final void transformCurrentChain(List<? extends Screen> list) {
        if (list.isEmpty()) {
            return;
        }
        List<? extends Screen> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Screen screen : list2) {
            arrayList.add(screen.getScreenKey());
        }
        List<String> transformCurrentChain$findOrderedIntersection = transformCurrentChain$findOrderedIntersection(arrayList, getLocalStackCopy());
        transformCurrentChain$removeLastScreens(this, getLocalStackCopy().size() - transformCurrentChain$findOrderedIntersection.size());
        for (Screen screen2 : list.subList(transformCurrentChain$findOrderedIntersection.size(), list.size())) {
            forward(new Forward(screen2));
        }
    }

    private static final List<String> transformCurrentChain$findOrderedIntersection(List<String> list, List<String> list2) {
        int min = Math.min(list.size(), list2.size());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < min && Intrinsics.areEqual(list.get(i), list2.get(i)); i++) {
            arrayList.add(list.get(i));
        }
        return arrayList;
    }

    private static final void transformCurrentChain$removeLastScreens(ExtendNavigator extendNavigator, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            extendNavigator.getFragmentManager().popBackStack();
            CollectionsKt.removeLast(extendNavigator.getLocalStackCopy());
        }
    }
}
