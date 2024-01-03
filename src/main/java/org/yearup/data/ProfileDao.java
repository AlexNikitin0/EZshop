package org.yearup.data;


import org.yearup.models.Profile;

public interface ProfileDao {
    Profile create(Profile profile);
    Profile getProfile(int userID);
    Profile update(int userId, Profile profile);
}
