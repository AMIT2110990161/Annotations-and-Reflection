package Annotations.ImplementaRole_BasedAccessControlwith_RoleAllowed;

class Security {
    @RoleAllowed("ADMIN")
    void secureMethod() {
        System.out.println("Access granted");
    }
}

