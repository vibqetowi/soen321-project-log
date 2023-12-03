package s1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import com.theinnerhour.b2b.utils.Constants;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import s1.g0;
/* compiled from: ActivityNavigator.kt */
@g0.b(Constants.SCREEN_ACTIVITY)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ls1/a;", "Ls1/g0;", "Ls1/a$a;", "a", Constants.ONBOARDING_VARIANT, "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class a extends g0<C0528a> {

    /* renamed from: c  reason: collision with root package name */
    public final Context f31067c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f31068d;

    /* compiled from: ActivityNavigator.kt */
    /* renamed from: s1.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0528a extends u {
        public Intent E;
        public String F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0528a(g0<? extends C0528a> activityNavigator) {
            super(activityNavigator);
            kotlin.jvm.internal.i.g(activityNavigator, "activityNavigator");
        }

        @Override // s1.u
        public final boolean equals(Object obj) {
            boolean z10;
            if (obj == null || !(obj instanceof C0528a) || !super.equals(obj)) {
                return false;
            }
            Intent intent = this.E;
            if (intent != null) {
                z10 = intent.filterEquals(((C0528a) obj).E);
            } else if (((C0528a) obj).E == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || !kotlin.jvm.internal.i.b(this.F, ((C0528a) obj).F)) {
                return false;
            }
            return true;
        }

        @Override // s1.u
        public final int hashCode() {
            int i6;
            int hashCode = super.hashCode() * 31;
            Intent intent = this.E;
            int i10 = 0;
            if (intent != null) {
                i6 = intent.filterHashCode();
            } else {
                i6 = 0;
            }
            int i11 = (hashCode + i6) * 31;
            String str = this.F;
            if (str != null) {
                i10 = str.hashCode();
            }
            return i11 + i10;
        }

        @Override // s1.u
        public final void t(Context context, AttributeSet attributeSet) {
            kotlin.jvm.internal.i.g(context, "context");
            super.t(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, sp.b.f31856c);
            kotlin.jvm.internal.i.f(obtainAttributes, "context.resources.obtain…tyNavigator\n            )");
            String string = obtainAttributes.getString(4);
            if (string != null) {
                String packageName = context.getPackageName();
                kotlin.jvm.internal.i.f(packageName, "context.packageName");
                string = gv.n.F0(string, "${applicationId}", packageName);
            }
            if (this.E == null) {
                this.E = new Intent();
            }
            Intent intent = this.E;
            kotlin.jvm.internal.i.d(intent);
            intent.setPackage(string);
            String string2 = obtainAttributes.getString(0);
            if (string2 != null) {
                if (string2.charAt(0) == '.') {
                    string2 = context.getPackageName() + string2;
                }
                ComponentName componentName = new ComponentName(context, string2);
                if (this.E == null) {
                    this.E = new Intent();
                }
                Intent intent2 = this.E;
                kotlin.jvm.internal.i.d(intent2);
                intent2.setComponent(componentName);
            }
            String string3 = obtainAttributes.getString(1);
            if (this.E == null) {
                this.E = new Intent();
            }
            Intent intent3 = this.E;
            kotlin.jvm.internal.i.d(intent3);
            intent3.setAction(string3);
            String string4 = obtainAttributes.getString(2);
            if (string4 != null) {
                Uri parse = Uri.parse(string4);
                if (this.E == null) {
                    this.E = new Intent();
                }
                Intent intent4 = this.E;
                kotlin.jvm.internal.i.d(intent4);
                intent4.setData(parse);
            }
            this.F = obtainAttributes.getString(3);
            obtainAttributes.recycle();
        }

        @Override // s1.u
        public final String toString() {
            ComponentName componentName;
            Intent intent = this.E;
            String str = null;
            if (intent != null) {
                componentName = intent.getComponent();
            } else {
                componentName = null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentName != null) {
                sb2.append(" class=");
                sb2.append(componentName.getClassName());
            } else {
                Intent intent2 = this.E;
                if (intent2 != null) {
                    str = intent2.getAction();
                }
                if (str != null) {
                    sb2.append(" action=");
                    sb2.append(str);
                }
            }
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "sb.toString()");
            return sb3;
        }
    }

    /* compiled from: ActivityNavigator.kt */
    /* loaded from: classes.dex */
    public static final class b implements g0.a {
    }

    /* compiled from: ActivityNavigator.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.l<Context, Context> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f31069u = new c();

        public c() {
            super(1);
        }

        @Override // ss.l
        public final Context invoke(Context context) {
            Context it = context;
            kotlin.jvm.internal.i.g(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public a(Context context) {
        Object obj;
        kotlin.jvm.internal.i.g(context, "context");
        this.f31067c = context;
        Iterator it = fv.k.x0(c.f31069u, context).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f31068d = (Activity) obj;
    }

    @Override // s1.g0
    public final C0528a a() {
        return new C0528a(this);
    }

    @Override // s1.g0
    public final u c(C0528a c0528a, Bundle bundle, a0 a0Var, g0.a aVar) {
        Intent intent;
        int intExtra;
        boolean z10;
        C0528a c0528a2 = c0528a;
        if (c0528a2.E != null) {
            Intent intent2 = new Intent(c0528a2.E);
            int i6 = 0;
            if (bundle != null) {
                intent2.putExtras(bundle);
                String str = c0528a2.F;
                if (str != null && str.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    StringBuffer stringBuffer = new StringBuffer();
                    Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                    while (matcher.find()) {
                        String group = matcher.group(1);
                        if (bundle.containsKey(group)) {
                            matcher.appendReplacement(stringBuffer, "");
                            stringBuffer.append(Uri.encode(String.valueOf(bundle.get(group))));
                        } else {
                            throw new IllegalArgumentException("Could not find " + group + " in " + bundle + " to fill data pattern " + str);
                        }
                    }
                    matcher.appendTail(stringBuffer);
                    intent2.setData(Uri.parse(stringBuffer.toString()));
                }
            }
            boolean z11 = aVar instanceof b;
            if (z11) {
                ((b) aVar).getClass();
                intent2.addFlags(0);
            }
            Activity activity = this.f31068d;
            if (activity == null) {
                intent2.addFlags(268435456);
            }
            if (a0Var != null && a0Var.f31070a) {
                intent2.addFlags(536870912);
            }
            if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
            }
            intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0528a2.B);
            Context context = this.f31067c;
            Resources resources = context.getResources();
            if (a0Var != null) {
                int i10 = a0Var.f31076h;
                int i11 = a0Var.f31077i;
                if ((i10 > 0 && kotlin.jvm.internal.i.b(resources.getResourceTypeName(i10), "animator")) || (i11 > 0 && kotlin.jvm.internal.i.b(resources.getResourceTypeName(i11), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i10) + " and popExit resource " + resources.getResourceName(i11) + " when launching " + c0528a2);
                } else {
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i10);
                    intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i11);
                }
            }
            if (z11) {
                ((b) aVar).getClass();
                context.startActivity(intent2);
            } else {
                context.startActivity(intent2);
            }
            if (a0Var != null && activity != null) {
                int i12 = a0Var.f;
                int i13 = a0Var.f31075g;
                if ((i12 > 0 && kotlin.jvm.internal.i.b(resources.getResourceTypeName(i12), "animator")) || (i13 > 0 && kotlin.jvm.internal.i.b(resources.getResourceTypeName(i13), "animator"))) {
                    Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i12) + " and exit resource " + resources.getResourceName(i13) + "when launching " + c0528a2);
                    return null;
                } else if (i12 >= 0 || i13 >= 0) {
                    if (i12 < 0) {
                        i12 = 0;
                    }
                    if (i13 >= 0) {
                        i6 = i13;
                    }
                    activity.overridePendingTransition(i12, i6);
                    return null;
                } else {
                    return null;
                }
            }
            return null;
        }
        throw new IllegalStateException(pl.a.g(new StringBuilder("Destination "), c0528a2.B, " does not have an Intent set.").toString());
    }

    @Override // s1.g0
    public final boolean j() {
        Activity activity = this.f31068d;
        if (activity != null) {
            activity.finish();
            return true;
        }
        return false;
    }
}
