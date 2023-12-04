package androidx.navigation.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ActionBarOnDestinationChangedListener.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "setNavigationIcon", "", "icon", "Landroid/graphics/drawable/Drawable;", "contentDescription", "", "setTitle", "title", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final AppCompatActivity activity;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionBarOnDestinationChangedListener(AppCompatActivity activity, AppBarConfiguration configuration) {
        super(r0, configuration);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            throw new IllegalStateException(("Activity " + activity + " does not have an DrawerToggleDelegate set").toString());
        }
        Context actionBarThemedContext = drawerToggleDelegate.getActionBarThemedContext();
        Intrinsics.checkNotNullExpressionValue(actionBarThemedContext, "checkNotNull(activity.dr… }.actionBarThemedContext");
        this.activity = activity;
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setTitle(CharSequence charSequence) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        Intrinsics.checkNotNullExpressionValue(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        supportActionBar.setTitle(charSequence);
    }

    @Override // androidx.navigation.ui.AbstractAppBarOnDestinationChangedListener
    protected void setNavigationIcon(Drawable drawable, int i) {
        ActionBar supportActionBar = this.activity.getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
        }
        Intrinsics.checkNotNullExpressionValue(supportActionBar, "checkNotNull(activity.su…ortActionBar()\"\n        }");
        supportActionBar.setDisplayHomeAsUpEnabled(drawable != null);
        ActionBarDrawerToggle.Delegate drawerToggleDelegate = this.activity.getDrawerToggleDelegate();
        if (drawerToggleDelegate == null) {
            throw new IllegalStateException(("Activity " + this.activity + " does not have an DrawerToggleDelegate set").toString());
        }
        Intrinsics.checkNotNullExpressionValue(drawerToggleDelegate, "checkNotNull(activity.dr…leDelegate set\"\n        }");
        drawerToggleDelegate.setActionBarUpIndicator(drawable, i);
    }
}
