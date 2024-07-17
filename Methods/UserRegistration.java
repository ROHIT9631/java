 class UserRegistration {

    static int dcdrLoc;
    static String surNm;
    static boolean isDcdrLocationValid;
    static boolean isSurNameValid;
    static boolean isEmailLoginSameValid;
    static boolean isGivenNameValid;
    static boolean isPassportDataCreated;

    static boolean isEmailLoginSm;

    public static void validateAndAssign(int dcdrLocation, String surName, boolean isEmailLoginSame, String givenName) {
        if (dcdrLocation > 0) {
            dcdrLoc = dcdrLocation;
            isDcdrLocationValid = true;
        } else {
            System.out.println("Please provide a valid dcdrLocation");
        }

        if (surName != null) {
            surNm = surName;
            isSurNameValid = true;
        } else {
            System.out.println("Please provide a valid Surname");
        }

        if (isEmailLoginSame) {
            isEmailLoginSm = isEmailLoginSame;
            isEmailLoginSameValid = true;
        } else {
            System.out.println("Please provide a valid isEmailLoginSame value");
        }

        if (givenName != null) {
            givenNm = givenName;
            isGivenNameValid = true;
        } else {
            System.out.println("Please provide a valid givenName value");
        }

        if (isDcdrLocationValid && isEmailLoginSameValid && isSurNameValid && isGivenNameValid) {
            isPassportDataCreated = true;
        }
    }

  
}
