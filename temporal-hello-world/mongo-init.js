db = db.getSiblingDB("temporal");
db.createUser({
    user: "temporal",
    pwd: "temporal",
    roles: [
        { role: "readWrite", db: "temporal" },
        { role: "dbAdmin", db: "temporal" }
    ]
});