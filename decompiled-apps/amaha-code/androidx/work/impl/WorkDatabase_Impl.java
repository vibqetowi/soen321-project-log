package androidx.work.impl;

import android.content.Context;
import b2.c;
import c2.b;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.i;
import n2.q;
import v2.c;
import v2.e;
import v2.g;
import v2.j;
import v2.k;
import v2.n;
import v2.o;
import v2.r;
import v2.t;
import v2.u;
import v2.x;
import v2.y;
import x1.h;
import x1.o;
import z1.a;
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: m  reason: collision with root package name */
    public volatile u f3249m;

    /* renamed from: n  reason: collision with root package name */
    public volatile c f3250n;

    /* renamed from: o  reason: collision with root package name */
    public volatile y f3251o;

    /* renamed from: p  reason: collision with root package name */
    public volatile k f3252p;

    /* renamed from: q  reason: collision with root package name */
    public volatile o f3253q;
    public volatile r r;

    /* renamed from: s  reason: collision with root package name */
    public volatile g f3254s;

    /* loaded from: classes.dex */
    public class a extends o.a {
        public a() {
        }

        @Override // x1.o.a
        public final void a(b bVar) {
            bVar.q("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.q("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.q("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.q("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            bVar.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            bVar.q("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.q("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.q("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.q("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
        }

        @Override // x1.o.a
        public final o.b b(b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new a.C0668a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap.put("prerequisite_id", new a.C0668a(2, 1, "prerequisite_id", "TEXT", null, true));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new a.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            hashSet2.add(new a.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), Arrays.asList("ASC"), false));
            z1.a aVar = new z1.a("Dependency", hashMap, hashSet, hashSet2);
            z1.a a10 = z1.a.a(bVar, "Dependency");
            if (!aVar.equals(a10)) {
                return new o.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + aVar + "\n Found:\n" + a10);
            }
            HashMap hashMap2 = new HashMap(27);
            hashMap2.put("id", new a.C0668a(1, 1, "id", "TEXT", null, true));
            hashMap2.put("state", new a.C0668a(0, 1, "state", "INTEGER", null, true));
            hashMap2.put("worker_class_name", new a.C0668a(0, 1, "worker_class_name", "TEXT", null, true));
            hashMap2.put("input_merger_class_name", new a.C0668a(0, 1, "input_merger_class_name", "TEXT", null, false));
            hashMap2.put("input", new a.C0668a(0, 1, "input", "BLOB", null, true));
            hashMap2.put("output", new a.C0668a(0, 1, "output", "BLOB", null, true));
            hashMap2.put("initial_delay", new a.C0668a(0, 1, "initial_delay", "INTEGER", null, true));
            hashMap2.put("interval_duration", new a.C0668a(0, 1, "interval_duration", "INTEGER", null, true));
            hashMap2.put("flex_duration", new a.C0668a(0, 1, "flex_duration", "INTEGER", null, true));
            hashMap2.put("run_attempt_count", new a.C0668a(0, 1, "run_attempt_count", "INTEGER", null, true));
            hashMap2.put("backoff_policy", new a.C0668a(0, 1, "backoff_policy", "INTEGER", null, true));
            hashMap2.put("backoff_delay_duration", new a.C0668a(0, 1, "backoff_delay_duration", "INTEGER", null, true));
            hashMap2.put("last_enqueue_time", new a.C0668a(0, 1, "last_enqueue_time", "INTEGER", null, true));
            hashMap2.put("minimum_retention_duration", new a.C0668a(0, 1, "minimum_retention_duration", "INTEGER", null, true));
            hashMap2.put("schedule_requested_at", new a.C0668a(0, 1, "schedule_requested_at", "INTEGER", null, true));
            hashMap2.put("run_in_foreground", new a.C0668a(0, 1, "run_in_foreground", "INTEGER", null, true));
            hashMap2.put("out_of_quota_policy", new a.C0668a(0, 1, "out_of_quota_policy", "INTEGER", null, true));
            hashMap2.put("period_count", new a.C0668a(0, 1, "period_count", "INTEGER", "0", true));
            hashMap2.put("generation", new a.C0668a(0, 1, "generation", "INTEGER", "0", true));
            hashMap2.put("required_network_type", new a.C0668a(0, 1, "required_network_type", "INTEGER", null, true));
            hashMap2.put("requires_charging", new a.C0668a(0, 1, "requires_charging", "INTEGER", null, true));
            hashMap2.put("requires_device_idle", new a.C0668a(0, 1, "requires_device_idle", "INTEGER", null, true));
            hashMap2.put("requires_battery_not_low", new a.C0668a(0, 1, "requires_battery_not_low", "INTEGER", null, true));
            hashMap2.put("requires_storage_not_low", new a.C0668a(0, 1, "requires_storage_not_low", "INTEGER", null, true));
            hashMap2.put("trigger_content_update_delay", new a.C0668a(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
            hashMap2.put("trigger_max_content_delay", new a.C0668a(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
            hashMap2.put("content_uri_triggers", new a.C0668a(0, 1, "content_uri_triggers", "BLOB", null, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new a.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), Arrays.asList("ASC"), false));
            hashSet4.add(new a.d("index_WorkSpec_last_enqueue_time", Arrays.asList("last_enqueue_time"), Arrays.asList("ASC"), false));
            z1.a aVar2 = new z1.a("WorkSpec", hashMap2, hashSet3, hashSet4);
            z1.a a11 = z1.a.a(bVar, "WorkSpec");
            if (!aVar2.equals(a11)) {
                return new o.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + aVar2 + "\n Found:\n" + a11);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new a.C0668a(1, 1, "tag", "TEXT", null, true));
            hashMap3.put("work_spec_id", new a.C0668a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new a.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            z1.a aVar3 = new z1.a("WorkTag", hashMap3, hashSet5, hashSet6);
            z1.a a12 = z1.a.a(bVar, "WorkTag");
            if (!aVar3.equals(a12)) {
                return new o.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + aVar3 + "\n Found:\n" + a12);
            }
            HashMap hashMap4 = new HashMap(3);
            hashMap4.put("work_spec_id", new a.C0668a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap4.put("generation", new a.C0668a(2, 1, "generation", "INTEGER", "0", true));
            hashMap4.put("system_id", new a.C0668a(0, 1, "system_id", "INTEGER", null, true));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            z1.a aVar4 = new z1.a("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            z1.a a13 = z1.a.a(bVar, "SystemIdInfo");
            if (!aVar4.equals(a13)) {
                return new o.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + aVar4 + "\n Found:\n" + a13);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(SessionManager.KEY_NAME, new a.C0668a(1, 1, SessionManager.KEY_NAME, "TEXT", null, true));
            hashMap5.put("work_spec_id", new a.C0668a(2, 1, "work_spec_id", "TEXT", null, true));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new a.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), Arrays.asList("ASC"), false));
            z1.a aVar5 = new z1.a("WorkName", hashMap5, hashSet8, hashSet9);
            z1.a a14 = z1.a.a(bVar, "WorkName");
            if (!aVar5.equals(a14)) {
                return new o.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + aVar5 + "\n Found:\n" + a14);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new a.C0668a(1, 1, "work_spec_id", "TEXT", null, true));
            hashMap6.put(Constants.SCREEN_PROGRESS, new a.C0668a(0, 1, Constants.SCREEN_PROGRESS, "BLOB", null, true));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new a.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            z1.a aVar6 = new z1.a("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            z1.a a15 = z1.a.a(bVar, "WorkProgress");
            if (!aVar6.equals(a15)) {
                return new o.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + aVar6 + "\n Found:\n" + a15);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new a.C0668a(1, 1, "key", "TEXT", null, true));
            hashMap7.put("long_value", new a.C0668a(0, 1, "long_value", "INTEGER", null, false));
            z1.a aVar7 = new z1.a("Preference", hashMap7, new HashSet(0), new HashSet(0));
            z1.a a16 = z1.a.a(bVar, "Preference");
            if (!aVar7.equals(a16)) {
                return new o.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + aVar7 + "\n Found:\n" + a16);
            }
            return new o.b(true, null);
        }
    }

    @Override // x1.n
    public final h d() {
        return new h(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // x1.n
    public final b2.c e(x1.b bVar) {
        x1.o oVar = new x1.o(bVar, new a());
        Context context = bVar.f37453a;
        i.g(context, "context");
        return bVar.f37455c.d(new c.b(context, bVar.f37454b, oVar, false, false));
    }

    @Override // x1.n
    public final List f(LinkedHashMap linkedHashMap) {
        return Arrays.asList(new n2.y(), new q());
    }

    @Override // x1.n
    public final Set<Class<? extends df.b>> h() {
        return new HashSet();
    }

    @Override // x1.n
    public final Map<Class<?>, List<Class<?>>> i() {
        HashMap hashMap = new HashMap();
        hashMap.put(t.class, Collections.emptyList());
        hashMap.put(v2.b.class, Collections.emptyList());
        hashMap.put(x.class, Collections.emptyList());
        hashMap.put(j.class, Collections.emptyList());
        hashMap.put(n.class, Collections.emptyList());
        hashMap.put(v2.q.class, Collections.emptyList());
        hashMap.put(e.class, Collections.emptyList());
        hashMap.put(v2.h.class, Collections.emptyList());
        return hashMap;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v2.b p() {
        v2.c cVar;
        if (this.f3250n != null) {
            return this.f3250n;
        }
        synchronized (this) {
            if (this.f3250n == null) {
                this.f3250n = new v2.c(this);
            }
            cVar = this.f3250n;
        }
        return cVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final e q() {
        g gVar;
        if (this.f3254s != null) {
            return this.f3254s;
        }
        synchronized (this) {
            if (this.f3254s == null) {
                this.f3254s = new g(this);
            }
            gVar = this.f3254s;
        }
        return gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final j r() {
        k kVar;
        if (this.f3252p != null) {
            return this.f3252p;
        }
        synchronized (this) {
            if (this.f3252p == null) {
                this.f3252p = new k(this);
            }
            kVar = this.f3252p;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final n s() {
        v2.o oVar;
        if (this.f3253q != null) {
            return this.f3253q;
        }
        synchronized (this) {
            if (this.f3253q == null) {
                this.f3253q = new v2.o(this);
            }
            oVar = this.f3253q;
        }
        return oVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final v2.q t() {
        r rVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            if (this.r == null) {
                this.r = new r(this);
            }
            rVar = this.r;
        }
        return rVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final t u() {
        u uVar;
        if (this.f3249m != null) {
            return this.f3249m;
        }
        synchronized (this) {
            if (this.f3249m == null) {
                this.f3249m = new u(this);
            }
            uVar = this.f3249m;
        }
        return uVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final x v() {
        y yVar;
        if (this.f3251o != null) {
            return this.f3251o;
        }
        synchronized (this) {
            if (this.f3251o == null) {
                this.f3251o = new y(this);
            }
            yVar = this.f3251o;
        }
        return yVar;
    }
}
