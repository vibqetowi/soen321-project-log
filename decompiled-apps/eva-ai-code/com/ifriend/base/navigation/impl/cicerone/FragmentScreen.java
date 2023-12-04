package com.ifriend.base.navigation.impl.cicerone;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.base.navigation.api.cicerone.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "clearContainer", "", "getClearContainer", "()Z", "createFragment", "Landroidx/fragment/app/Fragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FragmentScreen extends Screen {
    public static final Companion Companion = Companion.$$INSTANCE;

    Fragment createFragment(FragmentFactory fragmentFactory);

    boolean getClearContainer();

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static boolean getClearContainer(FragmentScreen fragmentScreen) {
            return true;
        }

        public static String getScreenKey(FragmentScreen fragmentScreen) {
            return Screen.DefaultImpls.getScreenKey(fragmentScreen);
        }
    }

    /* compiled from: AppScreen.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086\u0002¨\u0006\r"}, d2 = {"Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen$Companion;", "", "()V", "invoke", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "key", "", "clearContainer", "", "fragmentCreator", "Lcom/ifriend/base/navigation/impl/cicerone/Creator;", "Landroidx/fragment/app/FragmentFactory;", "Landroidx/fragment/app/Fragment;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public static /* synthetic */ FragmentScreen invoke$default(Companion companion, String str, boolean z, Creator creator, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            return companion.invoke(str, z, creator);
        }

        public final FragmentScreen invoke(final String str, final boolean z, final Creator<FragmentFactory, Fragment> fragmentCreator) {
            Intrinsics.checkNotNullParameter(fragmentCreator, "fragmentCreator");
            return new FragmentScreen(str, fragmentCreator, z) { // from class: com.ifriend.base.navigation.impl.cicerone.FragmentScreen$Companion$invoke$1
                final /* synthetic */ Creator<FragmentFactory, Fragment> $fragmentCreator;
                private final boolean clearContainer;
                private final String screenKey;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.$fragmentCreator = fragmentCreator;
                    this.screenKey = str == null ? fragmentCreator.getClass().getName() : str;
                    this.clearContainer = z;
                }

                @Override // com.ifriend.base.navigation.api.cicerone.Screen
                public String getScreenKey() {
                    return this.screenKey;
                }

                @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
                public boolean getClearContainer() {
                    return this.clearContainer;
                }

                @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
                public Fragment createFragment(FragmentFactory factory) {
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    return this.$fragmentCreator.create(factory);
                }
            };
        }
    }
}
