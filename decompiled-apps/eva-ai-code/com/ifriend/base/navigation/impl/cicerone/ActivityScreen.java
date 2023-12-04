package com.ifriend.base.navigation.impl.cicerone;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ifriend.base.navigation.api.cicerone.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/ifriend/base/navigation/impl/cicerone/ActivityScreen;", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "startActivityOptions", "Landroid/os/Bundle;", "getStartActivityOptions", "()Landroid/os/Bundle;", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ActivityScreen extends Screen {
    public static final Companion Companion = Companion.$$INSTANCE;

    Intent createIntent(Context context);

    Bundle getStartActivityOptions();

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static Bundle getStartActivityOptions(ActivityScreen activityScreen) {
            return null;
        }

        public static String getScreenKey(ActivityScreen activityScreen) {
            return Screen.DefaultImpls.getScreenKey(activityScreen);
        }
    }

    /* compiled from: AppScreen.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086\u0002¨\u0006\r"}, d2 = {"Lcom/ifriend/base/navigation/impl/cicerone/ActivityScreen$Companion;", "", "()V", "invoke", "Lcom/ifriend/base/navigation/impl/cicerone/ActivityScreen;", "key", "", "startActivityOptions", "Landroid/os/Bundle;", "intentCreator", "Lcom/ifriend/base/navigation/impl/cicerone/Creator;", "Landroid/content/Context;", "Landroid/content/Intent;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ ActivityScreen invoke$default(Companion companion, String str, Bundle bundle, Creator creator, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                bundle = null;
            }
            return companion.invoke(str, bundle, creator);
        }

        public final ActivityScreen invoke(final String str, final Bundle bundle, final Creator<Context, Intent> intentCreator) {
            Intrinsics.checkNotNullParameter(intentCreator, "intentCreator");
            return new ActivityScreen(str, intentCreator, bundle) { // from class: com.ifriend.base.navigation.impl.cicerone.ActivityScreen$Companion$invoke$1
                final /* synthetic */ Creator<Context, Intent> $intentCreator;
                private final String screenKey;
                private final Bundle startActivityOptions;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$intentCreator = intentCreator;
                    this.screenKey = str == null ? intentCreator.getClass().getName() : str;
                    this.startActivityOptions = bundle;
                }

                @Override // com.ifriend.base.navigation.api.cicerone.Screen
                public String getScreenKey() {
                    return this.screenKey;
                }

                @Override // com.ifriend.base.navigation.impl.cicerone.ActivityScreen
                public Bundle getStartActivityOptions() {
                    return this.startActivityOptions;
                }

                @Override // com.ifriend.base.navigation.impl.cicerone.ActivityScreen
                public Intent createIntent(Context context) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    return this.$intentCreator.create(context);
                }
            };
        }
    }
}
