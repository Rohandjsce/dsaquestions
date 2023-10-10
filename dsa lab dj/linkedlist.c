#include <stdio.h>

struct node

{
	int data;

	struct node * next;

};

struct node *head = NULL;

void insertbegin(int value)
{
	struct node *newnode = NULL;

	newnode = malloc(sizeof(struct node));

	newnode->data = value;

	if (head == NULL)

	{
		head = newnode;

		newnode->next = NULL;
	}
	else

	{
		newnode->next = head;

		head = newnode;
	}
}

void printlist()

{
	struct node *temp = head;

	while (temp != NULL)

	{
		printf("%d->", temp->data);

		temp = temp->next;
	}

	printf("null \n");

}

void insertend(int value)

{
	struct node *newnode = NULL;

	newnode = malloc(sizeof(struct node));

	newnode->data = value;

	if (head == NULL)

	{
		head = newnode;

		newnode->next = NULL;
	}
	else

	{
		struct node *temp = head;
		while (temp->next != NULL)
		{
			temp = temp->next;
		}

		temp->next = newnode;
		newnode->next = NULL;
	}
}

void deletbegin()
{
	if (head->next == NULL)
	{
		head = NULL;
		free(head);
	}
	else
	{
		struct node *temp = head;
		head = head->next;
		free(temp);
	}
}

void deleteend()
{
	if (head->next == NULL)
	{
		printf("the deleted elemnet is %d \n", head->data);
		head = NULL;
		free(head);
	}
	else
	{
		struct node *temp = head;
		struct node *q = temp;
		while (temp->next != NULL)
		{
			q = temp;
			temp = temp->next;
		}

		printf("the deleted elemnet is %d \n", temp->data);
		free(temp);
		q->next = NULL;
	}
}

int main()
{
	insertbegin(5);
	printlist();
	insertbegin(1);
	printlist();
	insertend(2);
	printlist();
	deletbegin();
	printlist();
	deleteend();
	printlist();
}