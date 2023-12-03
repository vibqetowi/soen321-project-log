package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.l1;
import com.theinnerhour.b2b.R;
import java.util.WeakHashMap;
import t0.d0;
import t0.o0;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public ImageView A;
    public ImageView B;
    public LinearLayout C;
    public final Drawable D;
    public final int E;
    public final Context F;
    public boolean G;
    public final Drawable H;
    public final boolean I;
    public LayoutInflater J;
    public boolean K;

    /* renamed from: u  reason: collision with root package name */
    public h f1051u;

    /* renamed from: v  reason: collision with root package name */
    public ImageView f1052v;

    /* renamed from: w  reason: collision with root package name */
    public RadioButton f1053w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f1054x;

    /* renamed from: y  reason: collision with root package name */
    public CheckBox f1055y;

    /* renamed from: z  reason: collision with root package name */
    public TextView f1056z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l1 m10 = l1.m(getContext(), attributeSet, kc.f.Q, R.attr.listMenuViewStyle);
        this.D = m10.e(5);
        this.E = m10.i(1, -1);
        this.G = m10.a(7, false);
        this.F = context;
        this.H = m10.e(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.I = obtainStyledAttributes.hasValue(0);
        m10.n();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.J == null) {
            this.J = LayoutInflater.from(getContext());
        }
        return this.J;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        int i6;
        ImageView imageView = this.A;
        if (imageView != null) {
            if (z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            imageView.setVisibility(i6);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.B;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.B.getLayoutParams();
            rect.top = this.B.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    @Override // androidx.appcompat.view.menu.k.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(h hVar) {
        int i6;
        boolean z10;
        char c10;
        int i10;
        String sb2;
        boolean z11;
        char c11;
        char c12;
        this.f1051u = hVar;
        int i11 = 0;
        if (hVar.isVisible()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        setVisibility(i6);
        setTitle(hVar.f1122e);
        setCheckable(hVar.isCheckable());
        f fVar = hVar.f1130n;
        if (fVar.o()) {
            if (fVar.n()) {
                c12 = hVar.f1126j;
            } else {
                c12 = hVar.f1124h;
            }
            if (c12 != 0) {
                z10 = true;
                fVar.n();
                if (z10) {
                    h hVar2 = this.f1051u;
                    f fVar2 = hVar2.f1130n;
                    if (fVar2.o()) {
                        if (fVar2.n()) {
                            c11 = hVar2.f1126j;
                        } else {
                            c11 = hVar2.f1124h;
                        }
                        if (c11 != 0) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                i11 = 8;
                if (i11 == 0) {
                    TextView textView = this.f1056z;
                    h hVar3 = this.f1051u;
                    if (hVar3.f1130n.n()) {
                        c10 = hVar3.f1126j;
                    } else {
                        c10 = hVar3.f1124h;
                    }
                    if (c10 == 0) {
                        sb2 = "";
                    } else {
                        f fVar3 = hVar3.f1130n;
                        Resources resources = fVar3.f1093a.getResources();
                        StringBuilder sb3 = new StringBuilder();
                        if (ViewConfiguration.get(fVar3.f1093a).hasPermanentMenuKey()) {
                            sb3.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (fVar3.n()) {
                            i10 = hVar3.f1127k;
                        } else {
                            i10 = hVar3.f1125i;
                        }
                        h.c(i10, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb3);
                        h.c(i10, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb3);
                        h.c(i10, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb3);
                        h.c(i10, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb3);
                        h.c(i10, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb3);
                        h.c(i10, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb3);
                        if (c10 != '\b') {
                            if (c10 != '\n') {
                                if (c10 != ' ') {
                                    sb3.append(c10);
                                } else {
                                    sb3.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                                }
                            } else {
                                sb3.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            }
                        } else {
                            sb3.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        }
                        sb2 = sb3.toString();
                    }
                    textView.setText(sb2);
                }
                if (this.f1056z.getVisibility() != i11) {
                    this.f1056z.setVisibility(i11);
                }
                setIcon(hVar.getIcon());
                setEnabled(hVar.isEnabled());
                setSubMenuArrowVisible(hVar.hasSubMenu());
                setContentDescription(hVar.f1133q);
            }
        }
        z10 = false;
        fVar.n();
        if (z10) {
        }
        i11 = 8;
        if (i11 == 0) {
        }
        if (this.f1056z.getVisibility() != i11) {
        }
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.f1133q);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f1051u;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        WeakHashMap<View, o0> weakHashMap = d0.f32288a;
        d0.d.q(this, this.D);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1054x = textView;
        int i6 = this.E;
        if (i6 != -1) {
            textView.setTextAppearance(this.F, i6);
        }
        this.f1056z = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.A = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.H);
        }
        this.B = (ImageView) findViewById(R.id.group_divider);
        this.C = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i6, int i10) {
        if (this.f1052v != null && this.G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1052v.getLayoutParams();
            int i11 = layoutParams.height;
            if (i11 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i11;
            }
        }
        super.onMeasure(i6, i10);
    }

    public void setCheckable(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f1053w == null && this.f1055y == null) {
            return;
        }
        if ((this.f1051u.f1139x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f1053w == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1053w = radioButton;
                LinearLayout linearLayout = this.C;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1053w;
            view = this.f1055y;
        } else {
            if (this.f1055y == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1055y = checkBox;
                LinearLayout linearLayout2 = this.C;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1055y;
            view = this.f1053w;
        }
        if (z10) {
            compoundButton.setChecked(this.f1051u.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f1055y;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1053w;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        boolean z11;
        CompoundButton compoundButton;
        if ((this.f1051u.f1139x & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (this.f1053w == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1053w = radioButton;
                LinearLayout linearLayout = this.C;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1053w;
        } else {
            if (this.f1055y == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1055y = checkBox;
                LinearLayout linearLayout2 = this.C;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1055y;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.K = z10;
        this.G = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        int i6;
        ImageView imageView = this.B;
        if (imageView != null) {
            if (!this.I && z10) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            imageView.setVisibility(i6);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1051u.f1130n.getClass();
        boolean z10 = this.K;
        if (!z10 && !this.G) {
            return;
        }
        ImageView imageView = this.f1052v;
        if (imageView == null && drawable == null && !this.G) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f1052v = imageView2;
            LinearLayout linearLayout = this.C;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.G) {
            this.f1052v.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f1052v;
        if (!z10) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f1052v.getVisibility() != 0) {
            this.f1052v.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1054x.setText(charSequence);
            if (this.f1054x.getVisibility() != 0) {
                this.f1054x.setVisibility(0);
            }
        } else if (this.f1054x.getVisibility() != 8) {
            this.f1054x.setVisibility(8);
        }
    }
}
