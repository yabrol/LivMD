/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package livmd;

/**
 *
 * @author Owner
 */
public class LivMd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    /**
     * zombiecrushsagaPropertyType represents the types of data that will need
     * to be extracted from XML files.
     */
    public enum LivMdPropertyType
    {
        /* SETUP FILE NAMES */
        UI_PROPERTIES_FILE_NAME,
        PROPERTIES_SCHEMA_FILE_NAME,
        GAME_FLAVOR_FILE_NAME,
        RECORD_FILE_NAME,

        /* DIRECTORIES FOR FILE LOADING */
        AUDIO_PATH,
        DATA_PATH,
        IMG_PATH,
        
        /* WINDOW DIMENSIONS & FRAME RATE */
        WINDOW_WIDTH,
        WINDOW_HEIGHT,
        FPS,
        GAME_WIDTH,
        GAME_HEIGHT,
        GAME_LEFT_OFFSET,
        GAME_TOP_OFFSET,
        
        /* GAME TEXT */
        GAME_TITLE_TEXT,
        EXIT_REQUEST_TEXT,
        INVALID_XML_FILE_ERROR_TEXT,
        ERROR_DIALOG_TITLE_TEXT,
        
        /* ERROR TYPES */
        AUDIO_FILE_ERROR,
        LOAD_LEVEL_ERROR,
        RECORD_SAVE_ERROR,
        LOAD_LEVEL_REQS_ERROR,

        /* IMAGE FILE NAMES */
        WINDOW_ICON,
        SPLASH_SCREEN_IMAGE_NAME,
        GAME_BACKGROUND_IMAGE_NAME,
        SAGA_SCREEN_1_IMAGE_NAME,
        SAGA_SCREEN_2_IMAGE_NAME,
        SAGA_SCREEN_3_IMAGE_NAME,
        SAGA_SCREEN_4_IMAGE_NAME,
        SAGA_SCREEN_5_IMAGE_NAME,
        SAGA_SCREEN_6_IMAGE_NAME,
        SAGA_SCREEN_7_IMAGE_NAME,
        SAGA_SCREEN_8_IMAGE_NAME,
        SAGA_SCREEN_9_IMAGE_NAME,
        
        ABOUT_SCREEN_IMAGE_NAME,
        LEVEL_SCREEN_IMAGE_NAME,
        
        ABOUT_DIALOG_IMAGE_NAME,
        LEVEL_DIALOG_IMAGE_NAME,
        
        BLANK_TILE_IMAGE_NAME,
        BLANK_TILE_SELECTED_IMAGE_NAME,
        
        ZOMBIE_HAMMER_IMAGE_NAME,
        
        BACK_BUTTON_IMAGE_NAME,
        BACK_BUTTON_MOUSE_OVER_IMAGE_NAME,
        TIME_IMAGE_NAME,
        LIVES_IMAGE_NAME,
        MOVES_IMAGE_NAME,
        NEXT_STAR_IMAGE_NAME,
        SCORE_IMAGE_NAME,
//        STAR_IMAGE_NAME,
        STAR_RED_IMAGE_NAME,
        STAR_BLUE_IMAGE_NAME,
        STAR_PURPLE_IMAGE_NAME,
        STAR_WIN_RED_IMAGE_NAME,
        STAR_WIN_BLUE_IMAGE_NAME,
        STAR_WIN_PURPLE_IMAGE_NAME,
        TILE_STACK_IMAGE_NAME,
        
        PLAY_BUTTON_IMAGE_NAME,
        RESET_BUTTON_IMAGE_NAME,
        QUIT_BUTTON_SPLASH_IMAGE_NAME,
        PLAY_BUTTON_MOUSE_OVER_IMAGE_NAME,
        RESET_BUTTON_MOUSE_OVER_IMAGE_NAME,
        QUIT_BUTTON_SPLASH_MOUSE_OVER_IMAGE_NAME,
        
        QUIT_BUTTON_SAGA_IMAGE_NAME,
        UP_BUTTON_IMAGE_NAME,
        DOWN_BUTTON_IMAGE_NAME,
        ABOUT_BUTTON_IMAGE_NAME,
        QUIT_BUTTON_SAGA_MOUSE_OVER_IMAGE_NAME,
        UP_BUTTON_MOUSE_OVER_IMAGE_NAME,
        DOWN_BUTTON_MOUSE_OVER_IMAGE_NAME,
        ABOUT_BUTTON_MOUSE_OVER_IMAGE_NAME,
        
        RETURN_FROM_ABOUT_BUTTON_IMAGE_NAME,
        RETURN_FROM_ABOUT_BUTTON_MOUSE_OVER_IMAGE_NAME,
        
        PLAY_LEVEL_BUTTON_IMAGE_NAME,
        PLAY_LEVEL_BUTTON_MOUSE_OVER_IMAGE_NAME,
        RETURN_FROM_LEVEL_BUTTON_IMAGE_NAME,
        RETURN_FROM_LEVEL_BUTTON_MOUSE_OVER_IMAGE_NAME,
        
        // AND THE end game
        WIN_IMAGE_NAME,
        LOSS_IMAGE_NAME,
        
        /* TILE LOADING STUFF */
        LEVEL_OPTIONS,
        LEVEL_IMAGE_OPTIONS,
        LEVEL_MOUSE_OVER_IMAGE_OPTIONS,
        TYPE_A_TILES,
        TYPE_B_TILES,
        TYPE_C_TILES,
        TYPE_D_TILES,
        TYPE_E_TILES,
        TYPE_F_TILES,
        TYPE_STRIPED_TILES,
        TYPE_BOMB_TILES,
        TYPE_WRAPPER_TILES,
        
        LEVEL_REQUIREMENTS,
        
        /* AUDIO CUES */
        SELECT_AUDIO_CUE,
        MATCH_AUDIO_CUE,
        NO_MATCH_AUDIO_CUE,
        BLOCKED_TILE_AUDIO_CUE,
        WIN_AUDIO_CUE,
        LOSS_AUDIO_CUE,
        SPLASH_SCREEN_SONG_CUE,
        SAGA_SCREEN_SONG_CUE,
        ABOUT_SCREEN_SONG_CUE,
        LEVEL_SCREEN_SONG_CUE,
        GAMEPLAY_SONG_CUE
    }
}
