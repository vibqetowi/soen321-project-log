package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import g.r;
import java.lang.ref.WeakReference;
import kc.f;
/* loaded from: classes.dex */
public final class AlertController {
    public TextView A;
    public TextView B;
    public View C;
    public ListAdapter D;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final c K;

    /* renamed from: a  reason: collision with root package name */
    public final Context f999a;

    /* renamed from: b  reason: collision with root package name */
    public final r f1000b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f1001c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1002d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1003e;
    public CharSequence f;

    /* renamed from: g  reason: collision with root package name */
    public RecycleListView f1004g;

    /* renamed from: h  reason: collision with root package name */
    public View f1005h;

    /* renamed from: i  reason: collision with root package name */
    public int f1006i;

    /* renamed from: k  reason: collision with root package name */
    public Button f1008k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f1009l;

    /* renamed from: m  reason: collision with root package name */
    public Message f1010m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f1011n;

    /* renamed from: o  reason: collision with root package name */
    public Button f1012o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f1013p;

    /* renamed from: q  reason: collision with root package name */
    public Message f1014q;
    public Drawable r;

    /* renamed from: s  reason: collision with root package name */
    public Button f1015s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f1016t;

    /* renamed from: u  reason: collision with root package name */
    public Message f1017u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f1018v;

    /* renamed from: w  reason: collision with root package name */
    public NestedScrollView f1019w;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f1021y;

    /* renamed from: z  reason: collision with root package name */
    public ImageView f1022z;

    /* renamed from: j  reason: collision with root package name */
    public boolean f1007j = false;

    /* renamed from: x  reason: collision with root package name */
    public int f1020x = 0;
    public int E = -1;
    public final a L = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: u  reason: collision with root package name */
        public final int f1023u;

        /* renamed from: v  reason: collision with root package name */
        public final int f1024v;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.S);
            this.f1024v = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f1023u = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f1008k && (message4 = alertController.f1010m) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f1012o && (message3 = alertController.f1014q) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f1015s && (message2 = alertController.f1017u) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            alertController.K.obtainMessage(1, alertController.f1000b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1026a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f1027b;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f1029d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f1030e;
        public View f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f1031g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f1032h;

        /* renamed from: i  reason: collision with root package name */
        public DialogInterface.OnClickListener f1033i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f1034j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f1035k;

        /* renamed from: m  reason: collision with root package name */
        public DialogInterface.OnKeyListener f1037m;

        /* renamed from: n  reason: collision with root package name */
        public ListAdapter f1038n;

        /* renamed from: o  reason: collision with root package name */
        public DialogInterface.OnClickListener f1039o;

        /* renamed from: p  reason: collision with root package name */
        public View f1040p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f1041q;

        /* renamed from: c  reason: collision with root package name */
        public int f1028c = 0;
        public int r = -1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1036l = true;

        public b(ContextThemeWrapper contextThemeWrapper) {
            this.f1026a = contextThemeWrapper;
            this.f1027b = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<DialogInterface> f1042a;

        public c(DialogInterface dialogInterface) {
            this.f1042a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            if (i6 != -3 && i6 != -2 && i6 != -1) {
                if (i6 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f1042a.get(), message.what);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i6) {
            super(context, i6, 16908308, (Object[]) null);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int i6) {
            return i6;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, r rVar, Window window) {
        this.f999a = context;
        this.f1000b = rVar;
        this.f1001c = window;
        this.K = new c(rVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.D, R.attr.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.G = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(7, 0);
        this.I = obtainStyledAttributes.getResourceId(3, 0);
        this.J = obtainStyledAttributes.getBoolean(6, true);
        this.f1002d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        rVar.c().t(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static void c(View view, View view2, View view3) {
        int i6;
        int i10 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i6 = 0;
            } else {
                i6 = 4;
            }
            view2.setVisibility(i6);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    public static ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void e(int i6, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.K.obtainMessage(i6, onClickListener);
        } else {
            message = null;
        }
        if (i6 != -3) {
            if (i6 != -2) {
                if (i6 == -1) {
                    this.f1009l = charSequence;
                    this.f1010m = message;
                    this.f1011n = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f1013p = charSequence;
            this.f1014q = message;
            this.r = null;
            return;
        }
        this.f1016t = charSequence;
        this.f1017u = message;
        this.f1018v = null;
    }
}
