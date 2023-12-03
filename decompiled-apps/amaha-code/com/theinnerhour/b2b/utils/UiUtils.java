package com.theinnerhour.b2b.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.R;
import com.theinnerhour.b2b.model.ProCard;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import kotlin.Metadata;
import t0.t0;
/* compiled from: UiUtils.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/theinnerhour/b2b/utils/UiUtils;", "", "()V", "getProCardForDate", "Lcom/theinnerhour/b2b/model/ProCard;", "oldestDate", "", Constants.SCREEN_ACTIVITY, "Landroid/app/Activity;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UiUtils {
    public static final Companion Companion = new Companion(null);

    public final ProCard getProCardForDate(long j10, Activity activity) {
        kotlin.jvm.internal.i.g(activity, "activity");
        if (ApplicationPersistence.getInstance().getLongValue("pro_card_1", 0L) != 0 && ApplicationPersistence.getInstance().getLongValue("pro_card_1", 0L) != j10) {
            if (ApplicationPersistence.getInstance().getLongValue("pro_card_2", 0L) != 0 && ApplicationPersistence.getInstance().getLongValue("pro_card_2", 0L) != j10) {
                if (ApplicationPersistence.getInstance().getLongValue("pro_card_3", 0L) != 0 && ApplicationPersistence.getInstance().getLongValue("pro_card_3", 0L) != j10) {
                    return new ProCard();
                }
                ApplicationPersistence.getInstance().setLongValue("pro_card_3", j10);
                String string = activity.getString(com.theinnerhour.b2b.R.string.proCardTitle3);
                kotlin.jvm.internal.i.f(string, "activity.getString(R.string.proCardTitle3)");
                String string2 = activity.getString(com.theinnerhour.b2b.R.string.proCardSubtitle3);
                kotlin.jvm.internal.i.f(string2, "activity.getString(R.string.proCardSubtitle3)");
                return new ProCard(string, string2, com.theinnerhour.b2b.R.drawable.ic_pro_card_db_3, com.theinnerhour.b2b.R.color.pro_card_pink, com.theinnerhour.b2b.R.color.pro_card_dark_blue);
            }
            ApplicationPersistence.getInstance().setLongValue("pro_card_2", j10);
            String string3 = activity.getString(com.theinnerhour.b2b.R.string.proCardTitle2);
            kotlin.jvm.internal.i.f(string3, "activity.getString(R.string.proCardTitle2)");
            String string4 = activity.getString(com.theinnerhour.b2b.R.string.proCardSubtitle2);
            kotlin.jvm.internal.i.f(string4, "activity.getString(R.string.proCardSubtitle2)");
            return new ProCard(string3, string4, com.theinnerhour.b2b.R.drawable.ic_pro_card_db_2, com.theinnerhour.b2b.R.color.pro_card_dark_blue, com.theinnerhour.b2b.R.color.white);
        }
        ApplicationPersistence.getInstance().setLongValue("pro_card_1", j10);
        String string5 = activity.getString(com.theinnerhour.b2b.R.string.proCardTitle1);
        kotlin.jvm.internal.i.f(string5, "activity.getString(R.string.proCardTitle1)");
        String string6 = activity.getString(com.theinnerhour.b2b.R.string.proCardSubtitle1);
        kotlin.jvm.internal.i.f(string6, "activity.getString(R.string.proCardSubtitle1)");
        return new ProCard(string5, string6, com.theinnerhour.b2b.R.drawable.ic_pro_card_db_1, com.theinnerhour.b2b.R.color.pro_card_light_blue, com.theinnerhour.b2b.R.color.pro_card_dark_blue);
    }

    /* compiled from: UiUtils.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J \u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004J \u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0004J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016J\"\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ%\u0010!\u001a\u00020\u00122\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u001f\"\u0004\u0018\u00010\r¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u00122\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u001f\"\u0004\u0018\u00010\r¢\u0006\u0004\b#\u0010\"J/\u0010&\u001a\u00020\u00122\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u001f\"\u0004\u0018\u00010\r2\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\u00020\u00122\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\u001f\"\u0004\u0018\u00010\r¢\u0006\u0004\b(\u0010\"J\u0016\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\rJ\u0016\u0010+\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\r¨\u0006."}, d2 = {"Lcom/theinnerhour/b2b/utils/UiUtils$Companion;", "", "Landroid/content/Context;", "context", "", "getScreenWidth", "value", "dpToPx", "layout", "Landroid/app/Dialog;", "getDialog", "styleId", "getStyledDialog", "Landroid/view/View;", "rootView", "getFullScreenDialog", "Landroid/widget/ImageView;", "imageView", "Lhs/k;", "increaseImageClickArea", "parent", "increaseViewClickArea", "Landroid/widget/Button;", "button", "increaseButtonClickArea", "id", "Landroidx/constraintlayout/widget/ConstraintLayout;", "constraintRoot", "Landroid/app/Activity;", Constants.SCREEN_ACTIVITY, "showSearch", "", "views", "disableClick", "([Landroid/view/View;)V", "enableClick", "", "makeInvisible", "hideViews", "([Landroid/view/View;Z)V", "showViews", "view", "hideKeyboardFrom", "showKeyboardFrom", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.d dVar) {
            this();
        }

        public static /* synthetic */ void hideViews$default(Companion companion, View[] viewArr, boolean z10, int i6, Object obj) {
            if ((i6 & 2) != 0) {
                z10 = false;
            }
            companion.hideViews(viewArr, z10);
        }

        public static final void increaseButtonClickArea$lambda$2(Button button, View parent) {
            kotlin.jvm.internal.i.g(button, "$button");
            kotlin.jvm.internal.i.g(parent, "$parent");
            Rect rect = new Rect();
            button.getHitRect(rect);
            rect.top -= 100;
            rect.left -= 100;
            rect.bottom += 100;
            rect.right += 100;
            parent.setTouchDelegate(new TouchDelegate(rect, button));
        }

        public static final void increaseImageClickArea$lambda$0(ImageView imageView, View parent) {
            kotlin.jvm.internal.i.g(imageView, "$imageView");
            kotlin.jvm.internal.i.g(parent, "$parent");
            Rect rect = new Rect();
            imageView.getHitRect(rect);
            rect.top -= 100;
            rect.left -= 100;
            rect.bottom += 100;
            rect.right += 100;
            parent.setTouchDelegate(new TouchDelegate(rect, imageView));
        }

        public static final void increaseViewClickArea$lambda$1(View parent) {
            kotlin.jvm.internal.i.g(parent, "$parent");
            Rect rect = new Rect();
            parent.getHitRect(rect);
            rect.top -= 100;
            rect.left -= 100;
            rect.bottom += 100;
            rect.right += 100;
            parent.setTouchDelegate(new TouchDelegate(rect, parent));
        }

        public final void disableClick(View... views) {
            kotlin.jvm.internal.i.g(views, "views");
            for (View view : views) {
                if (view != null) {
                    view.setEnabled(false);
                }
            }
        }

        public final int dpToPx(Context context, int i6) {
            kotlin.jvm.internal.i.g(context, "context");
            return (int) TypedValue.applyDimension(1, i6, context.getResources().getDisplayMetrics());
        }

        public final void enableClick(View... views) {
            kotlin.jvm.internal.i.g(views, "views");
            for (View view : views) {
                if (view != null) {
                    view.setEnabled(true);
                }
            }
        }

        public final Dialog getDialog(int i6, Context context) {
            kotlin.jvm.internal.i.d(context);
            Dialog dialog = new Dialog(context);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(true);
            Window window = dialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setContentView(i6);
            Window window2 = dialog.getWindow();
            kotlin.jvm.internal.i.d(window2);
            window2.getAttributes().dimAmount = 0.8f;
            return dialog;
        }

        public final Dialog getFullScreenDialog(int i6, Context context) {
            kotlin.jvm.internal.i.d(context);
            Dialog dialog = new Dialog(context, 16973837);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(true);
            Window window = dialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setContentView(i6);
            Window window2 = dialog.getWindow();
            kotlin.jvm.internal.i.d(window2);
            window2.getAttributes().dimAmount = 0.8f;
            return dialog;
        }

        public final int getScreenWidth(Context context) {
            kotlin.jvm.internal.i.g(context, "context");
            Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            return displayMetrics.widthPixels;
        }

        public final Dialog getStyledDialog(int i6, Context context, int i10) {
            kotlin.jvm.internal.i.d(context);
            Dialog dialog = new Dialog(context, i10);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(true);
            Window window = dialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setContentView(i6);
            Window window2 = dialog.getWindow();
            kotlin.jvm.internal.i.d(window2);
            window2.getAttributes().dimAmount = 0.8f;
            return dialog;
        }

        public final void hideKeyboardFrom(Context context, View view) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(view, "view");
            Object systemService = context.getSystemService("input_method");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }

        public final void hideViews(View[] views, boolean z10) {
            int i6;
            kotlin.jvm.internal.i.g(views, "views");
            for (View view : views) {
                if (view != null) {
                    if (z10) {
                        i6 = 4;
                    } else {
                        i6 = 8;
                    }
                    view.setVisibility(i6);
                }
            }
        }

        public final void increaseButtonClickArea(Button button) {
            kotlin.jvm.internal.i.g(button, "button");
            ViewParent parent = button.getParent();
            kotlin.jvm.internal.i.e(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            view.post(new nn.f(button, 14, view));
        }

        public final void increaseImageClickArea(ImageView imageView) {
            kotlin.jvm.internal.i.g(imageView, "imageView");
            ViewParent parent = imageView.getParent();
            kotlin.jvm.internal.i.e(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            view.post(new nn.f(imageView, 15, view));
        }

        public final void increaseViewClickArea(View parent) {
            kotlin.jvm.internal.i.g(parent, "parent");
            parent.post(new t0(parent, 2));
        }

        public final void showKeyboardFrom(Context context, View view) {
            kotlin.jvm.internal.i.g(context, "context");
            kotlin.jvm.internal.i.g(view, "view");
            Object systemService = context.getSystemService("input_method");
            kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(view, 1);
        }

        public final void showSearch(int i6, ConstraintLayout constraintLayout, Activity activity) {
            try {
                androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                bVar.e(i6, activity);
                bVar.b(constraintLayout);
                h2.b bVar2 = new h2.b();
                bVar2.f17045x = new AccelerateDecelerateInterpolator();
                h2.o.a(constraintLayout, bVar2);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e("ih_showSearch", "exception", e10);
            }
        }

        public final void showViews(View... views) {
            kotlin.jvm.internal.i.g(views, "views");
            for (View view : views) {
                if (view != null) {
                    view.setVisibility(0);
                }
            }
        }

        public final Dialog getStyledDialog(View rootView, Context context, int i6) {
            kotlin.jvm.internal.i.g(rootView, "rootView");
            kotlin.jvm.internal.i.d(context);
            Dialog dialog = new Dialog(context, i6);
            dialog.requestWindowFeature(1);
            dialog.setCancelable(true);
            Window window = dialog.getWindow();
            kotlin.jvm.internal.i.d(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            dialog.setContentView(rootView);
            Window window2 = dialog.getWindow();
            kotlin.jvm.internal.i.d(window2);
            window2.getAttributes().dimAmount = 0.8f;
            return dialog;
        }
    }
}
