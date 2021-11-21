package com.company;

public class Hero {
        private int heroHealth;
        private int heroDamag;
        private String heroSuperPower;

        public Hero(int heroHealth, int heroDamag, String heroSuperPower) {
            this. heroHealth = heroHealth;
            this. heroDamag = heroDamag;
            this. heroSuperPower = heroSuperPower;
        }

        public Hero(int heroHealth, int heroDamag) {
            this. heroHealth = heroHealth;
            this. heroDamag = heroDamag;
        }

        public  int getHeroHealth() {return  heroHealth;}

        public  int getHeroDamag() {return heroDamag;}

        public String getHeroSuperPower() {return heroSuperPower;}
    }

