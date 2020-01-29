import turtle 
def draw_square(some_turtle):
    for i in range(1,5):
        some_turtle.forward(100)
        some_turtle.right(90)
    
def draw_art():
    window = turtle.Screen()
    window.bgcolor("red")
    
    # Create the turtle brad - draw a Square
    
    brad = turtle.Turtle()
    brad.shape("turtle")
    brad.color("yellow")
    brad.speed(2)
    draw_square(brad)
    # Create the turtle Angle-draws a circle
    angie = turtle.Turtle()
    angie.shape("arrow")
    angie.color("blue")
    angie.circle(100)
    draw_square(angie)
    
    window.exitonclick()
    
draw_art()