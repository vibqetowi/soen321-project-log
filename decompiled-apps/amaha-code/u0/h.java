package u0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.z;
import com.appsflyer.R;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u0.l;
/* compiled from: AccessibilityNodeInfoCompat.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static int f33730d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f33731a;

    /* renamed from: b  reason: collision with root package name */
    public int f33732b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f33733c = -1;

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f33734e = new a(1);
        public static final a f = new a(2);

        /* renamed from: g  reason: collision with root package name */
        public static final a f33735g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f33736h;

        /* renamed from: i  reason: collision with root package name */
        public static final a f33737i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f33738j;

        /* renamed from: k  reason: collision with root package name */
        public static final a f33739k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f33740l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f33741m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f33742n;

        /* renamed from: a  reason: collision with root package name */
        public final Object f33743a;

        /* renamed from: b  reason: collision with root package name */
        public final int f33744b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends l.a> f33745c;

        /* renamed from: d  reason: collision with root package name */
        public final l f33746d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            new a(4);
            new a(8);
            f33735g = new a(16);
            new a(32);
            new a(64);
            new a(128);
            new a(256, l.b.class);
            new a(512, l.b.class);
            new a(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, l.c.class);
            new a(Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID, l.c.class);
            f33736h = new a(4096);
            f33737i = new a(8192);
            new a(16384);
            new a(32768);
            new a(65536);
            new a(131072, l.g.class);
            f33738j = new a(262144);
            f33739k = new a(524288);
            f33740l = new a(1048576);
            new a(2097152, l.h.class);
            int i6 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32 = null;
            if (i6 >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            new a(accessibilityAction, 16908342, null, null, null);
            if (i6 >= 23) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction31;
            } else {
                accessibilityAction2 = null;
            }
            new a(accessibilityAction2, 16908343, null, null, l.e.class);
            if (i6 >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction30;
            } else {
                accessibilityAction3 = null;
            }
            f33741m = new a(accessibilityAction3, 16908344, null, null, null);
            if (i6 >= 23) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction29;
            } else {
                accessibilityAction4 = null;
            }
            new a(accessibilityAction4, 16908345, null, null, null);
            if (i6 >= 23) {
                accessibilityAction5 = android.support.v4.media.b.m();
            } else {
                accessibilityAction5 = null;
            }
            f33742n = new a(accessibilityAction5, 16908346, null, null, null);
            if (i6 >= 23) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction28;
            } else {
                accessibilityAction6 = null;
            }
            new a(accessibilityAction6, 16908347, null, null, null);
            if (i6 >= 29) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction7 = null;
            }
            new a(accessibilityAction7, 16908358, null, null, null);
            if (i6 >= 29) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction27;
            } else {
                accessibilityAction8 = null;
            }
            new a(accessibilityAction8, 16908359, null, null, null);
            if (i6 >= 29) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction9 = null;
            }
            new a(accessibilityAction9, 16908360, null, null, null);
            if (i6 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction26;
            } else {
                accessibilityAction10 = null;
            }
            new a(accessibilityAction10, 16908361, null, null, null);
            if (i6 >= 23) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction25;
            } else {
                accessibilityAction11 = null;
            }
            new a(accessibilityAction11, 16908348, null, null, null);
            if (i6 >= 24) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction24;
            } else {
                accessibilityAction12 = null;
            }
            new a(accessibilityAction12, 16908349, null, null, l.f.class);
            if (i6 >= 26) {
                accessibilityAction13 = z.k();
            } else {
                accessibilityAction13 = null;
            }
            new a(accessibilityAction13, 16908354, null, null, l.d.class);
            if (i6 >= 28) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction23;
            } else {
                accessibilityAction14 = null;
            }
            new a(accessibilityAction14, 16908356, null, null, null);
            if (i6 >= 28) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction22;
            } else {
                accessibilityAction15 = null;
            }
            new a(accessibilityAction15, 16908357, null, null, null);
            if (i6 >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction16 = null;
            }
            new a(accessibilityAction16, 16908362, null, null, null);
            if (i6 >= 30) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
                accessibilityAction17 = accessibilityAction21;
            } else {
                accessibilityAction17 = null;
            }
            new a(accessibilityAction17, 16908372, null, null, null);
            if (i6 >= 32) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction18 = null;
            }
            new a(accessibilityAction18, 16908373, null, null, null);
            if (i6 >= 32) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction19 = null;
            }
            new a(accessibilityAction19, 16908374, null, null, null);
            if (i6 >= 32) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction20 = null;
            }
            new a(accessibilityAction20, 16908375, null, null, null);
            if (i6 >= 33) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new a(accessibilityAction32, 16908376, null, null, null);
        }

        public a(int i6) {
            this(null, i6, null, null, null);
        }

        public final int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f33743a).getId();
        }

        public final CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f33743a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = ((a) obj).f33743a;
            Object obj3 = this.f33743a;
            if (obj3 == null) {
                if (obj2 != null) {
                    return false;
                }
                return true;
            } else if (!obj3.equals(obj2)) {
                return false;
            } else {
                return true;
            }
        }

        public final int hashCode() {
            Object obj = this.f33743a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i6, Class cls) {
            this(null, i6, null, null, cls);
        }

        public a(Object obj, int i6, String str, l lVar, Class cls) {
            this.f33744b = i6;
            this.f33746d = lVar;
            if (obj == null) {
                this.f33743a = new AccessibilityNodeInfo.AccessibilityAction(i6, str);
            } else {
                this.f33743a = obj;
            }
            this.f33745c = cls;
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f33747a;

        public b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f33747a = collectionInfo;
        }

        public static b a(int i6, int i10, int i11, boolean z10) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i6, i10, z10, i11));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f33748a;

        public c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f33748a = collectionItemInfo;
        }

        public static c a(int i6, int i10, int i11, int i12, boolean z10, boolean z11) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i6, i10, i11, i12, z10, z11));
        }
    }

    public h(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f33731a = accessibilityNodeInfo;
    }

    public final void a(int i6) {
        this.f33731a.addAction(i6);
    }

    public final void b(a aVar) {
        this.f33731a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f33743a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33731a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    @Deprecated
    public final void d(Rect rect) {
        this.f33731a.getBoundsInParent(rect);
    }

    public final CharSequence e() {
        boolean z10 = !c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33731a;
        if (z10) {
            ArrayList c10 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c11 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c12 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c13 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i6 = 0; i6 < c10.size(); i6++) {
                spannableString.setSpan(new u0.a(((Integer) c13.get(i6)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c10.get(i6)).intValue(), ((Integer) c11.get(i6)).intValue(), ((Integer) c12.get(i6)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f33731a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f33731a;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        if (this.f33733c == hVar.f33733c && this.f33732b == hVar.f33732b) {
            return true;
        }
        return false;
    }

    public final void f(int i6, boolean z10) {
        Bundle extras = this.f33731a.getExtras();
        if (extras != null) {
            int i10 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i6);
            if (!z10) {
                i6 = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i6 | i10);
        }
    }

    public final void g(CharSequence charSequence) {
        this.f33731a.setClassName(charSequence);
    }

    public final void h(c cVar) {
        this.f33731a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f33748a);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33731a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void i(CharSequence charSequence) {
        this.f33731a.setContentDescription(charSequence);
    }

    public final void j(String str) {
        int i6 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33731a;
        if (i6 >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void k(boolean z10) {
        this.f33731a.setScrollable(z10);
    }

    public final void l(CharSequence charSequence) {
        this.f33731a.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    public final String toString() {
        String string;
        ?? emptyList;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        d(rect);
        sb2.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f33731a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(accessibilityNodeInfo.getPackageName());
        sb2.append("; className: ");
        sb2.append(accessibilityNodeInfo.getClassName());
        sb2.append("; text: ");
        sb2.append(e());
        sb2.append("; contentDescription: ");
        sb2.append(accessibilityNodeInfo.getContentDescription());
        sb2.append("; viewId: ");
        sb2.append(accessibilityNodeInfo.getViewIdResourceName());
        sb2.append("; uniqueId: ");
        if (o0.a.a()) {
            string = accessibilityNodeInfo.getUniqueId();
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb2.append(string);
        sb2.append("; checkable: ");
        sb2.append(accessibilityNodeInfo.isCheckable());
        sb2.append("; checked: ");
        sb2.append(accessibilityNodeInfo.isChecked());
        sb2.append("; focusable: ");
        sb2.append(accessibilityNodeInfo.isFocusable());
        sb2.append("; focused: ");
        sb2.append(accessibilityNodeInfo.isFocused());
        sb2.append("; selected: ");
        sb2.append(accessibilityNodeInfo.isSelected());
        sb2.append("; clickable: ");
        sb2.append(accessibilityNodeInfo.isClickable());
        sb2.append("; longClickable: ");
        sb2.append(accessibilityNodeInfo.isLongClickable());
        sb2.append("; enabled: ");
        sb2.append(accessibilityNodeInfo.isEnabled());
        sb2.append("; password: ");
        sb2.append(accessibilityNodeInfo.isPassword());
        sb2.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb2.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i6 = 0; i6 < size; i6++) {
                emptyList.add(new a(actionList.get(i6), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i10 = 0; i10 < emptyList.size(); i10++) {
            a aVar = (a) emptyList.get(i10);
            int a10 = aVar.a();
            if (a10 != 1) {
                if (a10 != 2) {
                    switch (a10) {
                        case 4:
                            str = "ACTION_SELECT";
                            break;
                        case 8:
                            str = "ACTION_CLEAR_SELECTION";
                            break;
                        case 16:
                            str = "ACTION_CLICK";
                            break;
                        case 32:
                            str = "ACTION_LONG_CLICK";
                            break;
                        case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                            str = "ACTION_ACCESSIBILITY_FOCUS";
                            break;
                        case 128:
                            str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                            break;
                        case 256:
                            str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                            break;
                        case 512:
                            str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                            break;
                        case Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID /* 1024 */:
                            str = "ACTION_NEXT_HTML_ELEMENT";
                            break;
                        case Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID /* 2048 */:
                            str = "ACTION_PREVIOUS_HTML_ELEMENT";
                            break;
                        case 4096:
                            str = "ACTION_SCROLL_FORWARD";
                            break;
                        case 8192:
                            str = "ACTION_SCROLL_BACKWARD";
                            break;
                        case 16384:
                            str = "ACTION_COPY";
                            break;
                        case 32768:
                            str = "ACTION_PASTE";
                            break;
                        case 65536:
                            str = "ACTION_CUT";
                            break;
                        case 131072:
                            str = "ACTION_SET_SELECTION";
                            break;
                        case 262144:
                            str = "ACTION_EXPAND";
                            break;
                        case 524288:
                            str = "ACTION_COLLAPSE";
                            break;
                        case 2097152:
                            str = "ACTION_SET_TEXT";
                            break;
                        case 16908354:
                            str = "ACTION_MOVE_WINDOW";
                            break;
                        default:
                            switch (a10) {
                                case 16908342:
                                    str = "ACTION_SHOW_ON_SCREEN";
                                    break;
                                case 16908343:
                                    str = "ACTION_SCROLL_TO_POSITION";
                                    break;
                                case 16908344:
                                    str = "ACTION_SCROLL_UP";
                                    break;
                                case 16908345:
                                    str = "ACTION_SCROLL_LEFT";
                                    break;
                                case 16908346:
                                    str = "ACTION_SCROLL_DOWN";
                                    break;
                                case 16908347:
                                    str = "ACTION_SCROLL_RIGHT";
                                    break;
                                case 16908348:
                                    str = "ACTION_CONTEXT_CLICK";
                                    break;
                                case 16908349:
                                    str = "ACTION_SET_PROGRESS";
                                    break;
                                default:
                                    switch (a10) {
                                        case 16908356:
                                            str = "ACTION_SHOW_TOOLTIP";
                                            break;
                                        case 16908357:
                                            str = "ACTION_HIDE_TOOLTIP";
                                            break;
                                        case 16908358:
                                            str = "ACTION_PAGE_UP";
                                            break;
                                        case 16908359:
                                            str = "ACTION_PAGE_DOWN";
                                            break;
                                        case 16908360:
                                            str = "ACTION_PAGE_LEFT";
                                            break;
                                        case 16908361:
                                            str = "ACTION_PAGE_RIGHT";
                                            break;
                                        case 16908362:
                                            str = "ACTION_PRESS_AND_HOLD";
                                            break;
                                        default:
                                            switch (a10) {
                                                case 16908372:
                                                    str = "ACTION_IME_ENTER";
                                                    break;
                                                case 16908373:
                                                    str = "ACTION_DRAG_START";
                                                    break;
                                                case 16908374:
                                                    str = "ACTION_DRAG_DROP";
                                                    break;
                                                case 16908375:
                                                    str = "ACTION_DRAG_CANCEL";
                                                    break;
                                                default:
                                                    str = "ACTION_UNKNOWN";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str = "ACTION_CLEAR_FOCUS";
                }
            } else {
                str = "ACTION_FOCUS";
            }
            if (str.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                str = aVar.b().toString();
            }
            sb2.append(str);
            if (i10 != emptyList.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }
}
