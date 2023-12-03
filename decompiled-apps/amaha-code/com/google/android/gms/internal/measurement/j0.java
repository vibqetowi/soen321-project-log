package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.R;
import da.a;
import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
/* loaded from: classes.dex */
public abstract class j0 extends y implements k0 {
    public j0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static k0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof k0) {
            return (k0) queryLocalInterface;
        }
        return new i0(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean v(int i6, Parcel parcel, Parcel parcel2, int i10) {
        boolean z10;
        boolean z11;
        n0 l0Var;
        boolean z12;
        boolean z13 = false;
        n0 n0Var = null;
        n0 n0Var2 = null;
        n0 n0Var3 = null;
        n0 n0Var4 = null;
        q0 q0Var = null;
        q0 q0Var2 = null;
        q0 q0Var3 = null;
        n0 n0Var5 = null;
        n0 n0Var6 = null;
        n0 n0Var7 = null;
        n0 n0Var8 = null;
        n0 n0Var9 = null;
        n0 n0Var10 = null;
        s0 s0Var = null;
        n0 n0Var11 = null;
        n0 n0Var12 = null;
        n0 n0Var13 = null;
        n0 n0Var14 = null;
        n0 n0Var15 = null;
        switch (i6) {
            case 1:
                long readLong = parcel.readLong();
                z.b(parcel);
                initialize(a.AbstractBinderC0186a.X1(parcel.readStrongBinder()), (t0) z.a(parcel, t0.CREATOR), readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (parcel.readInt() != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                long readLong2 = parcel.readLong();
                z.b(parcel);
                logEvent(readString, readString2, bundle, z10, z11, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof n0) {
                        l0Var = (n0) queryLocalInterface;
                    } else {
                        l0Var = new l0(readStrongBinder);
                    }
                    n0Var = l0Var;
                }
                long readLong3 = parcel.readLong();
                z.b(parcel);
                logEventAndBundle(readString3, readString4, bundle2, n0Var, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                da.a X1 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                ClassLoader classLoader = z.f8723a;
                if (parcel.readInt() != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                long readLong4 = parcel.readLong();
                z.b(parcel);
                setUserProperty(readString5, readString6, X1, z12, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = z.f8723a;
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof n0) {
                        n0Var15 = (n0) queryLocalInterface2;
                    } else {
                        n0Var15 = new l0(readStrongBinder2);
                    }
                }
                z.b(parcel);
                getUserProperties(readString7, readString8, z13, n0Var15);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface3 instanceof n0) {
                        n0Var14 = (n0) queryLocalInterface3;
                    } else {
                        n0Var14 = new l0(readStrongBinder3);
                    }
                }
                z.b(parcel);
                getMaxUserProperties(readString9, n0Var14);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                z.b(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                long readLong6 = parcel.readLong();
                z.b(parcel);
                setConditionalUserProperty((Bundle) z.a(parcel, Bundle.CREATOR), readLong6);
                break;
            case 9:
                z.b(parcel);
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) z.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface4 instanceof n0) {
                        n0Var13 = (n0) queryLocalInterface4;
                    } else {
                        n0Var13 = new l0(readStrongBinder4);
                    }
                }
                z.b(parcel);
                getConditionalUserProperties(readString11, readString12, n0Var13);
                break;
            case 11:
                ClassLoader classLoader3 = z.f8723a;
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                long readLong7 = parcel.readLong();
                z.b(parcel);
                setMeasurementEnabled(z13, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                z.b(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                z.b(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                z.b(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                da.a X12 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                long readLong11 = parcel.readLong();
                z.b(parcel);
                setCurrentScreen(X12, readString13, readString14, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface5 instanceof n0) {
                        n0Var12 = (n0) queryLocalInterface5;
                    } else {
                        n0Var12 = new l0(readStrongBinder5);
                    }
                }
                z.b(parcel);
                getCurrentScreenName(n0Var12);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof n0) {
                        n0Var11 = (n0) queryLocalInterface6;
                    } else {
                        n0Var11 = new l0(readStrongBinder6);
                    }
                }
                z.b(parcel);
                getCurrentScreenClass(n0Var11);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface7 instanceof s0) {
                        s0Var = (s0) queryLocalInterface7;
                    } else {
                        s0Var = new r0(readStrongBinder7);
                    }
                }
                z.b(parcel);
                setInstanceIdProvider(s0Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof n0) {
                        n0Var10 = (n0) queryLocalInterface8;
                    } else {
                        n0Var10 = new l0(readStrongBinder8);
                    }
                }
                z.b(parcel);
                getCachedAppInstanceId(n0Var10);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof n0) {
                        n0Var9 = (n0) queryLocalInterface9;
                    } else {
                        n0Var9 = new l0(readStrongBinder9);
                    }
                }
                z.b(parcel);
                getAppInstanceId(n0Var9);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof n0) {
                        n0Var8 = (n0) queryLocalInterface10;
                    } else {
                        n0Var8 = new l0(readStrongBinder10);
                    }
                }
                z.b(parcel);
                getGmpAppId(n0Var8);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof n0) {
                        n0Var7 = (n0) queryLocalInterface11;
                    } else {
                        n0Var7 = new l0(readStrongBinder11);
                    }
                }
                z.b(parcel);
                generateEventId(n0Var7);
                break;
            case 23:
                String readString15 = parcel.readString();
                long readLong12 = parcel.readLong();
                z.b(parcel);
                beginAdUnitExposure(readString15, readLong12);
                break;
            case 24:
                String readString16 = parcel.readString();
                long readLong13 = parcel.readLong();
                z.b(parcel);
                endAdUnitExposure(readString16, readLong13);
                break;
            case 25:
                da.a X13 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                z.b(parcel);
                onActivityStarted(X13, readLong14);
                break;
            case 26:
                da.a X14 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                z.b(parcel);
                onActivityStopped(X14, readLong15);
                break;
            case 27:
                long readLong16 = parcel.readLong();
                z.b(parcel);
                onActivityCreated(a.AbstractBinderC0186a.X1(parcel.readStrongBinder()), (Bundle) z.a(parcel, Bundle.CREATOR), readLong16);
                break;
            case 28:
                da.a X15 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                z.b(parcel);
                onActivityDestroyed(X15, readLong17);
                break;
            case 29:
                da.a X16 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                z.b(parcel);
                onActivityPaused(X16, readLong18);
                break;
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                da.a X17 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                z.b(parcel);
                onActivityResumed(X17, readLong19);
                break;
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                da.a X18 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface12 instanceof n0) {
                        n0Var6 = (n0) queryLocalInterface12;
                    } else {
                        n0Var6 = new l0(readStrongBinder12);
                    }
                }
                long readLong20 = parcel.readLong();
                z.b(parcel);
                onActivitySaveInstanceState(X18, n0Var6, readLong20);
                break;
            case 32:
                Bundle bundle3 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof n0) {
                        n0Var5 = (n0) queryLocalInterface13;
                    } else {
                        n0Var5 = new l0(readStrongBinder13);
                    }
                }
                long readLong21 = parcel.readLong();
                z.b(parcel);
                performAction(bundle3, n0Var5, readLong21);
                break;
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                int readInt = parcel.readInt();
                String readString17 = parcel.readString();
                da.a X19 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                da.a X110 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                da.a X111 = a.AbstractBinderC0186a.X1(parcel.readStrongBinder());
                z.b(parcel);
                logHealthData(readInt, readString17, X19, X110, X111);
                break;
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface14 instanceof q0) {
                        q0Var3 = (q0) queryLocalInterface14;
                    } else {
                        q0Var3 = new o0(readStrongBinder14);
                    }
                }
                z.b(parcel);
                setEventInterceptor(q0Var3);
                break;
            case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface15 instanceof q0) {
                        q0Var2 = (q0) queryLocalInterface15;
                    } else {
                        q0Var2 = new o0(readStrongBinder15);
                    }
                }
                z.b(parcel);
                registerOnMeasurementEventListener(q0Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface16 instanceof q0) {
                        q0Var = (q0) queryLocalInterface16;
                    } else {
                        q0Var = new o0(readStrongBinder16);
                    }
                }
                z.b(parcel);
                unregisterOnMeasurementEventListener(q0Var);
                break;
            case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                HashMap readHashMap = parcel.readHashMap(z.f8723a);
                z.b(parcel);
                initForTests(readHashMap);
                break;
            case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof n0) {
                        n0Var4 = (n0) queryLocalInterface17;
                    } else {
                        n0Var4 = new l0(readStrongBinder17);
                    }
                }
                int readInt2 = parcel.readInt();
                z.b(parcel);
                getTestFlag(n0Var4, readInt2);
                break;
            case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                ClassLoader classLoader4 = z.f8723a;
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                z.b(parcel);
                setDataCollectionEnabled(z13);
                break;
            case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof n0) {
                        n0Var3 = (n0) queryLocalInterface18;
                    } else {
                        n0Var3 = new l0(readStrongBinder18);
                    }
                }
                z.b(parcel);
                isDataCollectionEnabled(n0Var3);
                break;
            case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
            default:
                return false;
            case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                z.b(parcel);
                setDefaultEventParameters((Bundle) z.a(parcel, Bundle.CREATOR));
                break;
            case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                long readLong22 = parcel.readLong();
                z.b(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                long readLong23 = parcel.readLong();
                z.b(parcel);
                setConsent((Bundle) z.a(parcel, Bundle.CREATOR), readLong23);
                break;
            case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                long readLong24 = parcel.readLong();
                z.b(parcel);
                setConsentThirdParty((Bundle) z.a(parcel, Bundle.CREATOR), readLong24);
                break;
            case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface19 instanceof n0) {
                        n0Var2 = (n0) queryLocalInterface19;
                    } else {
                        n0Var2 = new l0(readStrongBinder19);
                    }
                }
                z.b(parcel);
                getSessionId(n0Var2);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
