# Capstone-Project1-EricaYoung

PROJECT_TOPIC: Kanban TaskBoard

Taskboards are visual displays used to structure project planning. Taskboards were traditional made on a whiteboard or corkboards.The 
concept behind this Taskboard application was to enhance the functionality of the traditional taskboard, by creating a virtual 
taskbaord that would allow users to have 24/7 access to the board. 

-------------------------------------------------------------------------------------------------------------------------------------------
FEATURES: 
Adding unlimited task to the board. 
Retrieving list of all task.

The users can add a task to the board 
by entering the following criteria:
  ---Title---    
  ---DueDate---    
  ---Discription---    
  ---Category---
  
The following API Routes include a discription of each route functions:
~ ~ @GetMapping(value = "/TaskBoard/Task") - Retrieves a list of all Tasks from the board.
~ ~ @PostMapping(value= "/TaskBoard/addTask") - User can add a task to the board.
~ ~ @GetMapping(value = "/TaskBoard/category/{category}") - Retrieves a list of all Task under selected category.
