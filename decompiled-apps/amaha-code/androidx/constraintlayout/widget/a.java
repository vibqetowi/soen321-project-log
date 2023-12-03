package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import java.util.Arrays;
import java.util.HashMap;
import tr.r;
import x.e;
import x.j;
/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class a extends View {
    public View[] A;
    public final HashMap<Integer, String> B;

    /* renamed from: u  reason: collision with root package name */
    public int[] f1805u;

    /* renamed from: v  reason: collision with root package name */
    public int f1806v;

    /* renamed from: w  reason: collision with root package name */
    public final Context f1807w;

    /* renamed from: x  reason: collision with root package name */
    public j f1808x;

    /* renamed from: y  reason: collision with root package name */
    public String f1809y;

    /* renamed from: z  reason: collision with root package name */
    public String f1810z;

    public a(Context context) {
        super(context);
        this.f1805u = new int[32];
        this.A = null;
        this.B = new HashMap<>();
        this.f1807w = context;
        m(null);
    }

    public final void e(String str) {
        if (str == null || str.length() == 0 || this.f1807w == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int l2 = l(trim);
        if (l2 != 0) {
            this.B.put(Integer.valueOf(l2), trim);
            f(l2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void f(int i6) {
        if (i6 == getId()) {
            return;
        }
        int i10 = this.f1806v + 1;
        int[] iArr = this.f1805u;
        if (i10 > iArr.length) {
            this.f1805u = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1805u;
        int i11 = this.f1806v;
        iArr2[i11] = i6;
        this.f1806v = i11 + 1;
    }

    public final void g(String str) {
        ConstraintLayout constraintLayout;
        if (str == null || str.length() == 0 || this.f1807w == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1805u, this.f1806v);
    }

    public final void h() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            i((ConstraintLayout) parent);
        }
    }

    public final void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i6 = 0; i6 < this.f1806v; i6++) {
            View c10 = constraintLayout.c(this.f1805u[i6]);
            if (c10 != null) {
                c10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    c10.setTranslationZ(c10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1807w.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = constraintLayout.getChildAt(i6);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(String str) {
        ConstraintLayout constraintLayout;
        int i6;
        Integer num;
        HashMap<String, Integer> hashMap;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        if (isInEditMode() && constraintLayout != null) {
            if ((str instanceof String) && (hashMap = constraintLayout.G) != null && hashMap.containsKey(str)) {
                num = constraintLayout.G.get(str);
            } else {
                num = null;
            }
            if (num instanceof Integer) {
                i6 = num.intValue();
                if (i6 == 0 && constraintLayout != null) {
                    i6 = k(constraintLayout, str);
                }
                if (i6 == 0) {
                    try {
                        i6 = b0.d.class.getField(str).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i6 != 0) {
                    Context context = this.f1807w;
                    return context.getResources().getIdentifier(str, "id", context.getPackageName());
                }
                return i6;
            }
        }
        i6 = 0;
        if (i6 == 0) {
            i6 = k(constraintLayout, str);
        }
        if (i6 == 0) {
        }
        if (i6 != 0) {
        }
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f33565y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i6 = 0; i6 < indexCount; i6++) {
                int index = obtainStyledAttributes.getIndex(i6);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1809y = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1810z = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(b.a aVar, j jVar, c.a aVar2, SparseArray sparseArray) {
        b.C0027b c0027b = aVar.f1823e;
        int[] iArr = c0027b.f1854j0;
        int i6 = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c0027b.f1856k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = c0027b.f1856k0.split(",");
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i10 = 0;
                    for (String str2 : split) {
                        int l2 = l(str2.trim());
                        if (l2 != 0) {
                            iArr2[i10] = l2;
                            i10++;
                        }
                    }
                    if (i10 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i10);
                    }
                    c0027b.f1854j0 = iArr2;
                } else {
                    c0027b.f1854j0 = null;
                }
            }
        }
        jVar.a();
        if (c0027b.f1854j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = c0027b.f1854j0;
            if (i6 < iArr3.length) {
                e eVar = (e) sparseArray.get(iArr3[i6]);
                if (eVar != null) {
                    jVar.b(eVar);
                }
                i6++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1809y;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1810z;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i6, int i10) {
        setMeasuredDimension(0, 0);
    }

    public final void q() {
        if (this.f1808x == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).f1787q0 = this.f1808x;
        }
    }

    public void setIds(String str) {
        this.f1809y = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f1806v = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                e(str.substring(i6));
                return;
            } else {
                e(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1810z = str;
        if (str == null) {
            return;
        }
        int i6 = 0;
        this.f1806v = 0;
        while (true) {
            int indexOf = str.indexOf(44, i6);
            if (indexOf == -1) {
                g(str.substring(i6));
                return;
            } else {
                g(str.substring(i6, indexOf));
                i6 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1809y = null;
        this.f1806v = 0;
        for (int i6 : iArr) {
            f(i6);
        }
    }

    @Override // android.view.View
    public final void setTag(int i6, Object obj) {
        super.setTag(i6, obj);
        if (obj == null && this.f1809y == null) {
            f(i6);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1805u = new int[32];
        this.A = null;
        this.B = new HashMap<>();
        this.f1807w = context;
        m(attributeSet);
    }

    public void p() {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void o(e eVar, boolean z10) {
    }
}
