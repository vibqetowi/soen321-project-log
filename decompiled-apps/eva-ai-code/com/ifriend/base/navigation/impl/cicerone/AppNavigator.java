package com.ifriend.base.navigation.impl.cicerone;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.base.navigation.api.cicerone.Back;
import com.ifriend.base.navigation.api.cicerone.BackTo;
import com.ifriend.base.navigation.api.cicerone.Command;
import com.ifriend.base.navigation.api.cicerone.Forward;
import com.ifriend.base.navigation.api.cicerone.Navigator;
import com.ifriend.base.navigation.api.cicerone.Replace;
import com.ifriend.base.navigation.api.cicerone.Screen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppNavigator.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u0018\u001a\u00020\u0019H\u0014J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J\u001d\u0010\u001d\u001a\u00020\u00192\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001c0\u001fH\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0019H\u0014J\u0010\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020#H\u0014J\b\u0010$\u001a\u00020\u0019H\u0002J\u0010\u0010%\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'H\u0014J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010&\u001a\u00020)H\u0002J\u0018\u0010*\u001a\u00020\u00192\u0006\u0010&\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0014J\b\u0010.\u001a\u00020\u0019H\u0002J\u001c\u0010/\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\n\u00100\u001a\u000601j\u0002`2H\u0014J\u0010\u00103\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u000204H\u0014J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u001506H\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u000208H\u0014J*\u00109\u001a\u00020\u00192\u0006\u0010&\u001a\u00020+2\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=2\u0006\u0010>\u001a\u00020=H\u0014J\u0018\u0010?\u001a\u00020\u00192\u0006\u0010&\u001a\u00020)2\u0006\u0010@\u001a\u00020AH\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\tX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u0007X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006B"}, d2 = {"Lcom/ifriend/base/navigation/impl/cicerone/AppNavigator;", "Lcom/ifriend/base/navigation/api/cicerone/Navigator;", "activity", "Landroidx/fragment/app/FragmentActivity;", "containerId", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "fragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "(Landroidx/fragment/app/FragmentActivity;ILandroidx/fragment/app/FragmentManager;Landroidx/fragment/app/FragmentFactory;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getContainerId", "()I", "getFragmentFactory", "()Landroidx/fragment/app/FragmentFactory;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "localStackCopy", "", "", "getLocalStackCopy", "()Ljava/util/List;", "activityBack", "", "applyCommand", "command", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "applyCommands", "commands", "", "([Lcom/ifriend/base/navigation/api/cicerone/Command;)V", "back", "backTo", "Lcom/ifriend/base/navigation/api/cicerone/BackTo;", "backToRoot", "backToUnexisting", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "checkAndStartActivity", "Lcom/ifriend/base/navigation/impl/cicerone/ActivityScreen;", "commitNewFragmentScreen", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "addToBackStack", "", "copyStackToLocal", "errorOnApplyCommand", "error", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "forward", "Lcom/ifriend/base/navigation/api/cicerone/Forward;", "getLocalStack", "", "replace", "Lcom/ifriend/base/navigation/api/cicerone/Replace;", "setupFragmentTransaction", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "currentFragment", "Landroidx/fragment/app/Fragment;", "nextFragment", "unexistingActivity", "activityIntent", "Landroid/content/Intent;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class AppNavigator implements Navigator {
    private final FragmentActivity activity;
    private final int containerId;
    private final FragmentFactory fragmentFactory;
    private final FragmentManager fragmentManager;
    private final List<String> localStackCopy;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppNavigator(FragmentActivity activity, int i) {
        this(activity, i, null, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AppNavigator(FragmentActivity activity, int i, FragmentManager fragmentManager) {
        this(activity, i, fragmentManager, null, 8, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
    }

    protected void setupFragmentTransaction(FragmentScreen screen, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment nextFragment) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
    }

    protected void unexistingActivity(ActivityScreen screen, Intent activityIntent) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(activityIntent, "activityIntent");
    }

    public AppNavigator(FragmentActivity activity, int i, FragmentManager fragmentManager, FragmentFactory fragmentFactory) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        this.activity = activity;
        this.containerId = i;
        this.fragmentManager = fragmentManager;
        this.fragmentFactory = fragmentFactory;
        this.localStackCopy = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    protected final int getContainerId() {
        return this.containerId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AppNavigator(FragmentActivity fragmentActivity, int i, FragmentManager fragmentManager, FragmentFactory fragmentFactory, int i2, DefaultConstructorMarker defaultConstructorMarker) {
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    protected final FragmentFactory getFragmentFactory() {
        return this.fragmentFactory;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final List<String> getLocalStackCopy() {
        return this.localStackCopy;
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Navigator
    public void applyCommands(Command[] commands) {
        Intrinsics.checkNotNullParameter(commands, "commands");
        this.fragmentManager.executePendingTransactions();
        copyStackToLocal();
        for (Command command : commands) {
            try {
                applyCommand(command);
            } catch (RuntimeException e) {
                errorOnApplyCommand(command, e);
            }
        }
    }

    private final void copyStackToLocal() {
        this.localStackCopy.clear();
        int backStackEntryCount = this.fragmentManager.getBackStackEntryCount();
        for (int i = 0; i < backStackEntryCount; i++) {
            List<String> list = this.localStackCopy;
            String name = this.fragmentManager.getBackStackEntryAt(i).getName();
            if (name == null) {
                name = "";
            }
            list.add(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void applyCommand(Command command) {
        Intrinsics.checkNotNullParameter(command, "command");
        if (command instanceof Forward) {
            forward((Forward) command);
        } else if (command instanceof Replace) {
            replace((Replace) command);
        } else if (command instanceof BackTo) {
            backTo((BackTo) command);
        } else if (command instanceof Back) {
            back();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void forward(Forward command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Screen screen = command.getScreen();
        if (screen instanceof ActivityScreen) {
            checkAndStartActivity((ActivityScreen) screen);
        } else if (screen instanceof FragmentScreen) {
            commitNewFragmentScreen((FragmentScreen) screen, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void replace(Replace command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Screen screen = command.getScreen();
        if (screen instanceof ActivityScreen) {
            checkAndStartActivity((ActivityScreen) screen);
            this.activity.finish();
        } else if (screen instanceof FragmentScreen) {
            if (!this.localStackCopy.isEmpty()) {
                this.fragmentManager.popBackStack();
                List<String> list = this.localStackCopy;
                list.remove(CollectionsKt.getLastIndex(list));
                commitNewFragmentScreen((FragmentScreen) screen, true);
                return;
            }
            commitNewFragmentScreen((FragmentScreen) screen, false);
        }
    }

    protected void back() {
        if (!this.localStackCopy.isEmpty()) {
            this.fragmentManager.popBackStack();
            List<String> list = this.localStackCopy;
            list.remove(CollectionsKt.getLastIndex(list));
            return;
        }
        activityBack();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void activityBack() {
        this.activity.finish();
    }

    protected void commitNewFragmentScreen(FragmentScreen screen, boolean z) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Fragment createFragment = screen.createFragment(this.fragmentFactory);
        FragmentTransaction beginTransaction = this.fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction(...)");
        beginTransaction.setReorderingAllowed(true);
        setupFragmentTransaction(screen, beginTransaction, this.fragmentManager.findFragmentById(this.containerId), createFragment);
        if (screen.getClearContainer()) {
            beginTransaction.replace(this.containerId, createFragment, screen.getScreenKey());
        } else {
            beginTransaction.add(this.containerId, createFragment, screen.getScreenKey());
        }
        if (z) {
            beginTransaction.addToBackStack(screen.getScreenKey());
            this.localStackCopy.add(screen.getScreenKey());
        }
        LifecycleOwnerKt.getLifecycleScope(this.activity).launchWhenResumed(new AppNavigator$commitNewFragmentScreen$1(beginTransaction, null));
    }

    protected void backTo(BackTo command) {
        Intrinsics.checkNotNullParameter(command, "command");
        Screen screen = command.getScreen();
        if (screen instanceof CloseActivityScreen) {
            this.activity.finish();
        } else if (screen == null) {
            backToRoot();
        } else {
            String screenKey = screen.getScreenKey();
            Iterator<String> it = this.localStackCopy.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual(it.next(), screenKey)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                List<String> list = this.localStackCopy;
                List<String> subList = list.subList(i, list.size());
                this.fragmentManager.popBackStack(((String) CollectionsKt.first((List<? extends Object>) subList)).toString(), 0);
                subList.clear();
                return;
            }
            backToUnexisting(screen);
        }
    }

    private final void backToRoot() {
        this.localStackCopy.clear();
        this.fragmentManager.popBackStack((String) null, 1);
    }

    private final void checkAndStartActivity(ActivityScreen activityScreen) {
        Intent createIntent = activityScreen.createIntent(this.activity);
        try {
            this.activity.startActivity(createIntent, activityScreen.getStartActivityOptions());
        } catch (ActivityNotFoundException unused) {
            unexistingActivity(activityScreen, createIntent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void backToUnexisting(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        backToRoot();
    }

    protected void errorOnApplyCommand(Command command, RuntimeException error) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(error, "error");
        throw error;
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Navigator
    public List<String> getLocalStack() {
        return this.localStackCopy;
    }
}
