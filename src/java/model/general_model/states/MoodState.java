package model.general_model.states;

public enum MoodState {
    HAPPY, SAD, ANGRY, HORNY, TIRED, PLAYFUL;
    public String tyanmodji(){
        switch(this){
            case HAPPY:
                return "⸜(｡˃ ᵕ ˂ )⸝♡   I'm happy to have you";
            case SAD:
                return "(˚ ˃̣̣̥⌓˂̣̣̥ )    I'm so sad...";
            case ANGRY:
                return "(¬`‸´¬)    I'm angry.";
            case HORNY:
                return "(,,>﹏<,,)   I'm.. horny";
            case TIRED:
                return "\"( - ⌓ - )\"    I need to rest!";
            case PLAYFUL:
                return "✧｡٩(ˊᗜˋ )و✧*｡     I wanna play!";
            default:
                return "";
        }

    }
}
    

