package cg;

import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.model.UserLibraryModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import is.u;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.i;
/* compiled from: AztecCode.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f5265a;

    /* renamed from: b  reason: collision with root package name */
    public int f5266b;

    /* renamed from: c  reason: collision with root package name */
    public int f5267c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5268d;

    public a(int i6) {
        HashMap<String, Object> appConfig;
        if (i6 != 1) {
            return;
        }
        this.f5268d = LogHelper.INSTANCE.makeLogTag("DashboardLibraryUtils");
        this.f5265a = 3;
        this.f5266b = 4;
        this.f5267c = 2;
        User user = FirebasePersistence.getInstance().getUser();
        if (user != null && (appConfig = user.getAppConfig()) != null) {
            i.b(appConfig.get(Constants.IH_RESOURCES_EXPERIMENT), Boolean.TRUE);
        }
    }

    public final void a(String str) {
        UserLibraryModel library;
        ArrayList<String> overAllRankedList;
        String str2;
        String str3;
        String str4;
        UserLibraryModel library2;
        ArrayList<String> audioRankedList;
        String str5;
        String str6;
        String str7;
        try {
            String str8 = "au_" + str;
            if (str != null) {
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null && (library2 = user.getLibrary()) != null && (audioRankedList = library2.getAudioRankedList()) != null) {
                    if (!audioRankedList.contains(str8)) {
                        int size = audioRankedList.size();
                        int i6 = this.f5266b;
                        if (size == i6) {
                            for (int i10 = i6 - 1; -1 < i10; i10--) {
                                if (i10 > 0) {
                                    str7 = audioRankedList.get(i10 - 1);
                                } else {
                                    str7 = str8;
                                }
                                audioRankedList.set(i10, str7);
                            }
                        } else {
                            String str9 = (String) u.p2(audioRankedList);
                            if (str9 == null) {
                                str9 = str8;
                            }
                            audioRankedList.add(str9);
                            if (audioRankedList.size() > 1) {
                                for (int size2 = audioRankedList.size() - 1; -1 < size2; size2--) {
                                    if (size2 > 0) {
                                        str6 = audioRankedList.get(size2 - 1);
                                    } else {
                                        str6 = str8;
                                    }
                                    audioRankedList.set(size2, str6);
                                }
                            }
                        }
                    } else {
                        for (int indexOf = audioRankedList.indexOf(str8); -1 < indexOf; indexOf--) {
                            if (indexOf > 0) {
                                str5 = audioRankedList.get(indexOf - 1);
                            } else {
                                str5 = str8;
                            }
                            audioRankedList.set(indexOf, str5);
                        }
                    }
                }
                User user2 = firebasePersistence.getUser();
                if (user2 != null && (library = user2.getLibrary()) != null && (overAllRankedList = library.getOverAllRankedList()) != null) {
                    if (!overAllRankedList.contains(str8)) {
                        int size3 = overAllRankedList.size();
                        int i11 = this.f5265a;
                        if (size3 == i11) {
                            for (int i12 = i11 - 1; -1 < i12; i12--) {
                                if (i12 > 0) {
                                    str4 = overAllRankedList.get(i12 - 1);
                                } else {
                                    str4 = str8;
                                }
                                overAllRankedList.set(i12, str4);
                            }
                        } else {
                            String str10 = (String) u.p2(overAllRankedList);
                            if (str10 == null) {
                                str10 = str8;
                            }
                            overAllRankedList.add(str10);
                            if (overAllRankedList.size() > 1) {
                                for (int size4 = overAllRankedList.size() - 1; -1 < size4; size4--) {
                                    if (size4 > 0) {
                                        str3 = overAllRankedList.get(size4 - 1);
                                    } else {
                                        str3 = str8;
                                    }
                                    overAllRankedList.set(size4, str3);
                                }
                            }
                        }
                    } else {
                        for (int indexOf2 = overAllRankedList.indexOf(str8); -1 < indexOf2; indexOf2--) {
                            if (indexOf2 > 0) {
                                str2 = overAllRankedList.get(indexOf2 - 1);
                            } else {
                                str2 = str8;
                            }
                            overAllRankedList.set(indexOf2, str2);
                        }
                    }
                }
                firebasePersistence.updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e((String) this.f5268d, e10);
        }
    }

    public final void b(String str) {
        UserLibraryModel library;
        ArrayList<String> overAllRankedList;
        String str2;
        String str3;
        String str4;
        UserLibraryModel library2;
        ArrayList<String> miniCourseRankedList;
        String str5;
        String str6;
        String str7;
        try {
            String str8 = "mc_" + str;
            if (str != null) {
                FirebasePersistence firebasePersistence = FirebasePersistence.getInstance();
                User user = firebasePersistence.getUser();
                if (user != null && (library2 = user.getLibrary()) != null && (miniCourseRankedList = library2.getMiniCourseRankedList()) != null) {
                    if (!miniCourseRankedList.contains(str8)) {
                        int size = miniCourseRankedList.size();
                        int i6 = this.f5267c;
                        if (size == i6) {
                            for (int i10 = i6 - 1; -1 < i10; i10--) {
                                if (i10 > 0) {
                                    str7 = miniCourseRankedList.get(i10 - 1);
                                } else {
                                    str7 = str8;
                                }
                                miniCourseRankedList.set(i10, str7);
                            }
                        } else {
                            String str9 = (String) u.p2(miniCourseRankedList);
                            if (str9 == null) {
                                str9 = str8;
                            }
                            miniCourseRankedList.add(str9);
                            if (miniCourseRankedList.size() > 1) {
                                for (int size2 = miniCourseRankedList.size() - 1; -1 < size2; size2--) {
                                    if (size2 > 0) {
                                        str6 = miniCourseRankedList.get(size2 - 1);
                                    } else {
                                        str6 = str8;
                                    }
                                    miniCourseRankedList.set(size2, str6);
                                }
                            }
                        }
                    } else {
                        for (int indexOf = miniCourseRankedList.indexOf(str8); -1 < indexOf; indexOf--) {
                            if (indexOf > 0) {
                                str5 = miniCourseRankedList.get(indexOf - 1);
                            } else {
                                str5 = str8;
                            }
                            miniCourseRankedList.set(indexOf, str5);
                        }
                    }
                }
                User user2 = firebasePersistence.getUser();
                if (user2 != null && (library = user2.getLibrary()) != null && (overAllRankedList = library.getOverAllRankedList()) != null) {
                    if (!overAllRankedList.contains(str8)) {
                        int size3 = overAllRankedList.size();
                        int i11 = this.f5265a;
                        if (size3 == i11) {
                            for (int i12 = i11 - 1; -1 < i12; i12--) {
                                if (i12 > 0) {
                                    str4 = overAllRankedList.get(i12 - 1);
                                } else {
                                    str4 = str8;
                                }
                                overAllRankedList.set(i12, str4);
                            }
                        } else {
                            String str10 = (String) u.p2(overAllRankedList);
                            if (str10 == null) {
                                str10 = str8;
                            }
                            overAllRankedList.add(str10);
                            if (overAllRankedList.size() > 1) {
                                for (int size4 = overAllRankedList.size() - 1; -1 < size4; size4--) {
                                    if (size4 > 0) {
                                        str3 = overAllRankedList.get(size4 - 1);
                                    } else {
                                        str3 = str8;
                                    }
                                    overAllRankedList.set(size4, str3);
                                }
                            }
                        }
                    } else {
                        for (int indexOf2 = overAllRankedList.indexOf(str8); -1 < indexOf2; indexOf2--) {
                            if (indexOf2 > 0) {
                                str2 = overAllRankedList.get(indexOf2 - 1);
                            } else {
                                str2 = str8;
                            }
                            overAllRankedList.set(indexOf2, str2);
                        }
                    }
                }
                firebasePersistence.updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e((String) this.f5268d, e10);
        }
    }

    public final void c(String str) {
        FirebasePersistence firebasePersistence;
        User user;
        UserLibraryModel library;
        ArrayList<String> overAllRankedList;
        String str2;
        String str3;
        String str4;
        try {
            String str5 = "rs_" + str;
            if (str != null && (user = (firebasePersistence = FirebasePersistence.getInstance()).getUser()) != null && (library = user.getLibrary()) != null && (overAllRankedList = library.getOverAllRankedList()) != null) {
                if (!overAllRankedList.contains(str5)) {
                    int size = overAllRankedList.size();
                    int i6 = this.f5265a;
                    if (size == i6) {
                        for (int i10 = i6 - 1; -1 < i10; i10--) {
                            if (i10 > 0) {
                                str4 = overAllRankedList.get(i10 - 1);
                            } else {
                                str4 = str5;
                            }
                            overAllRankedList.set(i10, str4);
                        }
                    } else {
                        String str6 = (String) u.p2(overAllRankedList);
                        if (str6 == null) {
                            str6 = str5;
                        }
                        overAllRankedList.add(str6);
                        if (overAllRankedList.size() > 1) {
                            for (int size2 = overAllRankedList.size() - 1; -1 < size2; size2--) {
                                if (size2 > 0) {
                                    str3 = overAllRankedList.get(size2 - 1);
                                } else {
                                    str3 = str5;
                                }
                                overAllRankedList.set(size2, str3);
                            }
                        }
                    }
                } else {
                    for (int indexOf = overAllRankedList.indexOf(str5); -1 < indexOf; indexOf--) {
                        if (indexOf > 0) {
                            str2 = overAllRankedList.get(indexOf - 1);
                        } else {
                            str2 = str5;
                        }
                        overAllRankedList.set(indexOf, str2);
                    }
                }
                firebasePersistence.updateUserOnFirebase();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e((String) this.f5268d, e10);
        }
    }
}
