package t0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.theinnerhour.b2b.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import t0.d0;
import u0.h;
import u0.l;
/* compiled from: AccessibilityDelegateCompat.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f32268c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f32269a;

    /* renamed from: b  reason: collision with root package name */
    public final C0543a f32270b;

    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: t0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0543a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f32271a;

        public C0543a(a aVar) {
            this.f32271a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f32271a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            u0.i b10 = this.f32271a.b(view);
            if (b10 != null) {
                return (AccessibilityNodeProvider) b10.f33749a;
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f32271a.c(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z10;
            Object tag;
            boolean z11;
            boolean z12;
            Object tag2;
            boolean z13;
            boolean z14;
            Object tag3;
            int i6;
            u0.h hVar = new u0.h(accessibilityNodeInfo);
            WeakHashMap<View, o0> weakHashMap = d0.f32288a;
            boolean z15 = true;
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = true;
            } else {
                z10 = false;
            }
            ClickableSpan[] clickableSpanArr = null;
            if (z10) {
                tag = Boolean.valueOf(d0.m.d(view));
            } else {
                tag = view.getTag(R.id.tag_screen_reader_focusable);
                if (!Boolean.class.isInstance(tag)) {
                    tag = null;
                }
            }
            Boolean bool = (Boolean) tag;
            if (bool != null && bool.booleanValue()) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                accessibilityNodeInfo.setScreenReaderFocusable(z11);
            } else {
                hVar.f(1, z11);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                tag2 = Boolean.valueOf(d0.m.c(view));
            } else {
                tag2 = view.getTag(R.id.tag_accessibility_heading);
                if (!Boolean.class.isInstance(tag2)) {
                    tag2 = null;
                }
            }
            Boolean bool2 = (Boolean) tag2;
            if (bool2 != null && bool2.booleanValue()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i10 >= 28) {
                accessibilityNodeInfo.setHeading(z13);
            } else {
                hVar.f(2, z13);
            }
            CharSequence e10 = d0.e(view);
            if (i10 >= 28) {
                accessibilityNodeInfo.setPaneTitle(e10);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", e10);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                tag3 = d0.o.a(view);
            } else {
                tag3 = view.getTag(R.id.tag_state_description);
                if (!CharSequence.class.isInstance(tag3)) {
                    tag3 = null;
                }
            }
            CharSequence charSequence = (CharSequence) tag3;
            if (i10 < 30) {
                z15 = false;
            }
            if (z15) {
                accessibilityNodeInfo.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f32271a.d(view, hVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i10 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                        if (((WeakReference) sparseArray.valueAt(i11)).get() == null) {
                            arrayList.add(Integer.valueOf(i11));
                        }
                    }
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        sparseArray.remove(((Integer) arrayList.get(i12)).intValue());
                    }
                }
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                    hVar.f33731a.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i13 = 0; i13 < clickableSpanArr.length; i13++) {
                        ClickableSpan clickableSpan = clickableSpanArr[i13];
                        int i14 = 0;
                        while (true) {
                            if (i14 < sparseArray2.size()) {
                                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i14)).get())) {
                                    i6 = sparseArray2.keyAt(i14);
                                    break;
                                }
                                i14++;
                            } else {
                                i6 = u0.h.f33730d;
                                u0.h.f33730d = i6 + 1;
                                break;
                            }
                        }
                        sparseArray2.put(i6, new WeakReference(clickableSpanArr[i13]));
                        ClickableSpan clickableSpan2 = clickableSpanArr[i13];
                        Spanned spanned = (Spanned) text;
                        hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        hVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i6));
                    }
                }
            }
            List list = (List) view.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i15 = 0; i15 < list.size(); i15++) {
                hVar.b((h.a) list.get(i15));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f32271a.e(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f32271a.f(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final boolean performAccessibilityAction(View view, int i6, Bundle bundle) {
            return this.f32271a.g(view, i6, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEvent(View view, int i6) {
            this.f32271a.h(view, i6);
        }

        @Override // android.view.View.AccessibilityDelegate
        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f32271a.i(view, accessibilityEvent);
        }
    }

    /* compiled from: AccessibilityDelegateCompat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static AccessibilityNodeProvider a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        public static boolean b(View.AccessibilityDelegate accessibilityDelegate, View view, int i6, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i6, bundle);
        }
    }

    public a() {
        this(f32268c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f32269a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public u0.i b(View view) {
        AccessibilityNodeProvider a10 = b.a(this.f32269a, view);
        if (a10 != null) {
            return new u0.i(a10);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f32269a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, u0.h hVar) {
        this.f32269a.onInitializeAccessibilityNodeInfo(view, hVar.f33731a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f32269a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f32269a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i6, Bundle bundle) {
        boolean z10;
        WeakReference weakReference;
        boolean z11;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z12 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= list.size()) {
                break;
            }
            h.a aVar = (h.a) list.get(i10);
            if (aVar.a() == i6) {
                u0.l lVar = aVar.f33746d;
                if (lVar != null) {
                    Class<? extends l.a> cls = aVar.f33745c;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]).getClass();
                        } catch (Exception e10) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e10);
                        }
                    }
                    z10 = lVar.a(view);
                }
            } else {
                i10++;
            }
        }
        z10 = false;
        if (!z10) {
            z10 = b.b(this.f32269a, view, i6, bundle);
        }
        if (!z10 && i6 == R.id.accessibility_action_clickable_span && bundle != null) {
            int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    } else {
                        clickableSpanArr = null;
                    }
                    for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                        if (clickableSpan.equals(clickableSpanArr[i12])) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (z11) {
                    clickableSpan.onClick(view);
                    z12 = true;
                }
            }
            return z12;
        }
        return z10;
    }

    public void h(View view, int i6) {
        this.f32269a.sendAccessibilityEvent(view, i6);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f32269a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f32269a = accessibilityDelegate;
        this.f32270b = new C0543a(this);
    }
}
