package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import g.d;
import g.e;
import g.r;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* compiled from: AlertDialog.java */
/* loaded from: classes.dex */
public class b extends r implements DialogInterface {

    /* renamed from: y  reason: collision with root package name */
    public final AlertController f1045y;

    /* compiled from: AlertDialog.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f1046a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1047b;

        public a(Context context) {
            this(context, b.e(0, context));
        }

        public final void a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1046a;
            bVar.f1034j = charSequence;
            bVar.f1035k = onClickListener;
        }

        public final void b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1046a;
            bVar.f1032h = charSequence;
            bVar.f1033i = onClickListener;
        }

        public final void c() {
            create().show();
        }

        public b create() {
            int i6;
            AlertController.b bVar = this.f1046a;
            b bVar2 = new b(bVar.f1026a, this.f1047b);
            View view = bVar.f;
            AlertController alertController = bVar2.f1045y;
            if (view != null) {
                alertController.C = view;
            } else {
                CharSequence charSequence = bVar.f1030e;
                if (charSequence != null) {
                    alertController.f1003e = charSequence;
                    TextView textView = alertController.A;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar.f1029d;
                if (drawable != null) {
                    alertController.f1021y = drawable;
                    alertController.f1020x = 0;
                    ImageView imageView = alertController.f1022z;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f1022z.setImageDrawable(drawable);
                    }
                }
                int i10 = bVar.f1028c;
                if (i10 != 0) {
                    alertController.f1021y = null;
                    alertController.f1020x = i10;
                    ImageView imageView2 = alertController.f1022z;
                    if (imageView2 != null) {
                        if (i10 != 0) {
                            imageView2.setVisibility(0);
                            alertController.f1022z.setImageResource(alertController.f1020x);
                        } else {
                            imageView2.setVisibility(8);
                        }
                    }
                }
            }
            CharSequence charSequence2 = bVar.f1031g;
            if (charSequence2 != null) {
                alertController.f = charSequence2;
                TextView textView2 = alertController.B;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = bVar.f1032h;
            if (charSequence3 != null) {
                alertController.e(-1, charSequence3, bVar.f1033i);
            }
            CharSequence charSequence4 = bVar.f1034j;
            if (charSequence4 != null) {
                alertController.e(-2, charSequence4, bVar.f1035k);
            }
            if (bVar.f1038n != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar.f1027b.inflate(alertController.G, (ViewGroup) null);
                if (bVar.f1041q) {
                    i6 = alertController.H;
                } else {
                    i6 = alertController.I;
                }
                ListAdapter listAdapter = bVar.f1038n;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar.f1026a, i6);
                }
                alertController.D = listAdapter;
                alertController.E = bVar.r;
                if (bVar.f1039o != null) {
                    recycleListView.setOnItemClickListener(new androidx.appcompat.app.a(bVar, alertController));
                }
                if (bVar.f1041q) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f1004g = recycleListView;
            }
            View view2 = bVar.f1040p;
            if (view2 != null) {
                alertController.f1005h = view2;
                alertController.f1006i = 0;
                alertController.f1007j = false;
            }
            bVar2.setCancelable(bVar.f1036l);
            if (bVar.f1036l) {
                bVar2.setCanceledOnTouchOutside(true);
            }
            bVar2.setOnCancelListener(null);
            bVar2.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = bVar.f1037m;
            if (onKeyListener != null) {
                bVar2.setOnKeyListener(onKeyListener);
            }
            return bVar2;
        }

        public Context getContext() {
            return this.f1046a.f1026a;
        }

        public a setNegativeButton(int i6, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1046a;
            bVar.f1034j = bVar.f1026a.getText(i6);
            bVar.f1035k = onClickListener;
            return this;
        }

        public a setPositiveButton(int i6, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f1046a;
            bVar.f1032h = bVar.f1026a.getText(i6);
            bVar.f1033i = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f1046a.f1030e = charSequence;
            return this;
        }

        public a setView(View view) {
            this.f1046a.f1040p = view;
            return this;
        }

        public a(Context context, int i6) {
            this.f1046a = new AlertController.b(new ContextThemeWrapper(context, b.e(i6, context)));
            this.f1047b = i6;
        }
    }

    public b(Context context, int i6) {
        super(context, e(i6, context));
        this.f1045y = new AlertController(getContext(), this, getWindow());
    }

    public static int e(int i6, Context context) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z10;
        boolean z11;
        View view;
        boolean z12;
        boolean z13;
        boolean z14;
        int i6;
        boolean z15;
        ListAdapter listAdapter;
        View view2;
        int i10;
        int i11;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        AlertController alertController = this.f1045y;
        alertController.f1000b.setContentView(alertController.F);
        Window window = alertController.f1001c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view3 = alertController.f1005h;
        int i12 = 0;
        Context context = alertController.f999a;
        if (view3 == null) {
            if (alertController.f1006i != 0) {
                view3 = LayoutInflater.from(context).inflate(alertController.f1006i, viewGroup, false);
            } else {
                view3 = null;
            }
        }
        if (view3 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !AlertController.a(view3)) {
            window.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f1007j) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (alertController.f1004g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup d10 = AlertController.d(findViewById7, findViewById4);
        ViewGroup d11 = AlertController.d(findViewById8, findViewById5);
        ViewGroup d12 = AlertController.d(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        alertController.f1019w = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f1019w.setNestedScrollingEnabled(false);
        TextView textView = (TextView) d11.findViewById(16908299);
        alertController.B = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f1019w.removeView(alertController.B);
                if (alertController.f1004g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f1019w.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f1019w);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f1004g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    d11.setVisibility(8);
                }
            }
        }
        Button button = (Button) d12.findViewById(16908313);
        alertController.f1008k = button;
        AlertController.a aVar = alertController.L;
        button.setOnClickListener(aVar);
        boolean isEmpty = TextUtils.isEmpty(alertController.f1009l);
        int i13 = alertController.f1002d;
        if (isEmpty && alertController.f1011n == null) {
            alertController.f1008k.setVisibility(8);
            z11 = false;
        } else {
            alertController.f1008k.setText(alertController.f1009l);
            Drawable drawable = alertController.f1011n;
            if (drawable != null) {
                drawable.setBounds(0, 0, i13, i13);
                alertController.f1008k.setCompoundDrawables(alertController.f1011n, null, null, null);
            }
            alertController.f1008k.setVisibility(0);
            z11 = true;
        }
        Button button2 = (Button) d12.findViewById(16908314);
        alertController.f1012o = button2;
        button2.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f1013p) && alertController.r == null) {
            alertController.f1012o.setVisibility(8);
        } else {
            alertController.f1012o.setText(alertController.f1013p);
            Drawable drawable2 = alertController.r;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i13, i13);
                alertController.f1012o.setCompoundDrawables(alertController.r, null, null, null);
            }
            alertController.f1012o.setVisibility(0);
            z11 |= true;
        }
        Button button3 = (Button) d12.findViewById(16908315);
        alertController.f1015s = button3;
        button3.setOnClickListener(aVar);
        if (TextUtils.isEmpty(alertController.f1016t) && alertController.f1018v == null) {
            alertController.f1015s.setVisibility(8);
            view = null;
        } else {
            alertController.f1015s.setText(alertController.f1016t);
            Drawable drawable3 = alertController.f1018v;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i13, i13);
                view = null;
                alertController.f1015s.setCompoundDrawables(alertController.f1018v, null, null, null);
            } else {
                view = null;
            }
            alertController.f1015s.setVisibility(0);
            z11 |= true;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            if (z11) {
                AlertController.b(alertController.f1008k);
            } else if (z11) {
                AlertController.b(alertController.f1012o);
            } else if (z11) {
                AlertController.b(alertController.f1015s);
            }
        }
        if (z11) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (!z13) {
            d12.setVisibility(8);
        }
        if (alertController.C != null) {
            d10.addView(alertController.C, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.f1022z = (ImageView) window.findViewById(16908294);
            if ((!TextUtils.isEmpty(alertController.f1003e)) && alertController.J) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                alertController.A = textView2;
                textView2.setText(alertController.f1003e);
                int i14 = alertController.f1020x;
                if (i14 != 0) {
                    alertController.f1022z.setImageResource(i14);
                } else {
                    Drawable drawable4 = alertController.f1021y;
                    if (drawable4 != null) {
                        alertController.f1022z.setImageDrawable(drawable4);
                    } else {
                        alertController.A.setPadding(alertController.f1022z.getPaddingLeft(), alertController.f1022z.getPaddingTop(), alertController.f1022z.getPaddingRight(), alertController.f1022z.getPaddingBottom());
                        alertController.f1022z.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                alertController.f1022z.setVisibility(8);
                d10.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (d10 != null && d10.getVisibility() != 8) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        if (d12.getVisibility() != 8) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15 && (findViewById2 = d11.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f1019w;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (alertController.f == null && alertController.f1004g == null) {
                findViewById = view;
            } else {
                findViewById = d10.findViewById(R.id.titleDividerNoCustom);
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            View findViewById10 = d11.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController.RecycleListView recycleListView = alertController.f1004g;
        if (recycleListView instanceof AlertController.RecycleListView) {
            recycleListView.getClass();
            if (!z15 || i6 == 0) {
                int paddingLeft = recycleListView.getPaddingLeft();
                if (i6 != 0) {
                    i10 = recycleListView.getPaddingTop();
                } else {
                    i10 = recycleListView.f1023u;
                }
                int paddingRight = recycleListView.getPaddingRight();
                if (z15) {
                    i11 = recycleListView.getPaddingBottom();
                } else {
                    i11 = recycleListView.f1024v;
                }
                recycleListView.setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }
        if (!z14) {
            View view4 = alertController.f1004g;
            if (view4 == null) {
                view4 = alertController.f1019w;
            }
            if (view4 != null) {
                if (z15) {
                    i12 = 2;
                }
                int i15 = i6 | i12;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i16 = Build.VERSION.SDK_INT;
                if (i16 >= 23) {
                    WeakHashMap<View, o0> weakHashMap = d0.f32288a;
                    if (i16 >= 23) {
                        d0.j.d(view4, i15, 3);
                    }
                    if (findViewById11 != null) {
                        d11.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        d11.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i15 & 1) == 0) {
                        d11.removeView(findViewById11);
                        findViewById11 = view;
                    }
                    if (findViewById12 != null && (i15 & 2) == 0) {
                        d11.removeView(findViewById12);
                        view2 = view;
                    } else {
                        view2 = findViewById12;
                    }
                    if (findViewById11 != null || view2 != null) {
                        if (alertController.f != null) {
                            alertController.f1019w.setOnScrollChangeListener(new g.b(findViewById11, view2));
                            alertController.f1019w.post(new g.c(alertController, findViewById11, view2));
                        } else {
                            AlertController.RecycleListView recycleListView2 = alertController.f1004g;
                            if (recycleListView2 != null) {
                                recycleListView2.setOnScrollListener(new d(findViewById11, view2));
                                alertController.f1004g.post(new e(alertController, findViewById11, view2));
                            } else {
                                if (findViewById11 != null) {
                                    d11.removeView(findViewById11);
                                }
                                if (view2 != null) {
                                    d11.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        AlertController.RecycleListView recycleListView3 = alertController.f1004g;
        if (recycleListView3 != null && (listAdapter = alertController.D) != null) {
            recycleListView3.setAdapter(listAdapter);
            int i17 = alertController.E;
            if (i17 > -1) {
                recycleListView3.setItemChecked(i17, true);
                recycleListView3.setSelection(i17);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f1045y.f1019w;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i6, KeyEvent keyEvent) {
        boolean z10;
        NestedScrollView nestedScrollView = this.f1045y.f1019w;
        if (nestedScrollView != null && nestedScrollView.executeKeyEvent(keyEvent)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        return super.onKeyUp(i6, keyEvent);
    }

    @Override // g.r, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f1045y;
        alertController.f1003e = charSequence;
        TextView textView = alertController.A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
